package Mierdas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.ArrayList;
import java.util.Random;

public class BallPhysicsSimulation extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 800;
    private static final int CIRCLE_RADIUS = 300;
    private static final double GRAVITY = 0; // Low gravity
    private static final double BOUNCINESS = 1; // More bouncy
    private static final double GAP_SIZE = Math.toRadians(20); // Larger gap (20 degrees)
    private static final double ROTATION_SPEED = Math.toRadians(0.5); // Slow clockwise rotation
    private static final int MAX_BALLS = 100;

    private ArrayList<Ball> balls = new ArrayList<>();
    private double circleRotation = 0;
    private Timer timer;
    private Random random = new Random();

    public BallPhysicsSimulation() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);

        // Add initial ball
        balls.add(new Ball(0, 0, 15));

        // Set up animation timer
        timer = new Timer(16, e -> {
            updatePhysics();
            repaint();
        });
        timer.start();
    }

    private void updatePhysics() {
        // Update circle rotation
        circleRotation += ROTATION_SPEED;
        if (circleRotation > 2 * Math.PI) {
            circleRotation -= 2 * Math.PI;
        }

        // Temporary list for new balls
        ArrayList<Ball> newBalls = new ArrayList<>();

        // Update each ball's physics
        for (Ball ball : balls) {
            // Apply gravity (downward in screen coordinates)
            ball.vy += GRAVITY;

            // Update position
            ball.x += ball.vx;
            ball.y += ball.vy;

            // Check collision with circle boundary
            double distanceFromCenter = Math.sqrt(ball.x * ball.x + ball.y * ball.y);
            if (distanceFromCenter > CIRCLE_RADIUS - ball.radius) {
                // Calculate angle to determine if ball is at the gap
                double angle = Math.atan2(ball.y, ball.x);
                double rotatedAngle = angle - circleRotation;
                // Normalize angle to [0, 2π)
                while (rotatedAngle < 0) rotatedAngle += 2 * Math.PI;
                while (rotatedAngle >= 2 * Math.PI) rotatedAngle -= 2 * Math.PI;

                // Check if ball is at the gap
                if (rotatedAngle > GAP_SIZE/2 && rotatedAngle < 2*Math.PI - GAP_SIZE/2) {
                    // Collision with wall (not the gap)
                    // Calculate normal vector at collision point
                    double nx = ball.x / distanceFromCenter;
                    double ny = ball.y / distanceFromCenter;

                    // Calculate dot product of velocity and normal
                    double dotProduct = ball.vx * nx + ball.vy * ny;

                    // Apply bounce with bounciness coefficient
                    ball.vx = BOUNCINESS * (ball.vx - 2 * dotProduct * nx);
                    ball.vy = BOUNCINESS * (ball.vy - 2 * dotProduct * ny);

                    // Reposition ball to be exactly at the boundary
                    double correction = (CIRCLE_RADIUS - ball.radius) / distanceFromCenter;
                    ball.x *= correction;
                    ball.y *= correction;
                } else {
                    // Ball escaped through the gap
                    // Remove this ball (will be replaced with 2 new ones)
                    ball.shouldRemove = true;

                    if (balls.size() + newBalls.size() < MAX_BALLS - 1) {
                        // Add 2 new balls at center with random velocities
                        newBalls.add(new Ball(0, 0, ball.radius));
                        newBalls.add(new Ball(0, 0, ball.radius));
                    }
                }
            }
        }

        // Remove balls that escaped
        balls.removeIf(ball -> ball.shouldRemove);

        // Add new balls if we haven't reached the maximum
        if (balls.size() + newBalls.size() <= MAX_BALLS) {
            balls.addAll(newBalls);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the rotating circle with gap
        drawCircleWithGap(g2d);

        // Draw all balls
        for (Ball ball : balls) {
            g2d.setColor(ball.color);
            int screenX = (int) (WIDTH / 2 + ball.x);
            int screenY = (int) (HEIGHT / 2 + ball.y);
            g2d.fillOval(screenX - ball.radius, screenY - ball.radius,
                    ball.radius * 2, ball.radius * 2);
        }

        // Display ball count
        g2d.setColor(Color.WHITE);
        g2d.drawString("Balls: " + balls.size(), 10, 20);
    }

    private void drawCircleWithGap(Graphics2D g2d) {
        int circleX = WIDTH / 2 - CIRCLE_RADIUS;
        int circleY = HEIGHT / 2 - CIRCLE_RADIUS;
        int diameter = CIRCLE_RADIUS * 2;

        // Create a circle with a gap
        Arc2D circle = new Arc2D.Double(circleX, circleY, diameter, diameter,
                Math.toDegrees(circleRotation + GAP_SIZE/2),
                360 - Math.toDegrees(GAP_SIZE), Arc2D.OPEN);

        g2d.setStroke(new BasicStroke(2));
        g2d.setColor(Color.WHITE);
        g2d.draw(circle);
    }

    private class Ball {
        double x, y; // Position relative to center
        double vx, vy; // Velocity
        int radius;
        Color color;
        boolean shouldRemove = false;

        public Ball(double x, double y, int radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
            // Random initial velocity (but not too fast)
            this.vx = random.nextDouble() * 4 - 2;
            this.vy = random.nextDouble() * 4 - 2;
            // Random color (but not too dark)
            this.color = new Color(
                    100 + random.nextInt(156),
                    100 + random.nextInt(156),
                    100 + random.nextInt(156));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Ball Physics Simulation");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.add(new BallPhysicsSimulation());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}