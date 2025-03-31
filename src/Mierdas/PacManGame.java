import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class PacManGame extends JPanel implements ActionListener, KeyListener {
    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;
    private static final int TILE_SIZE = 20;
    private static final int DELAY = 140; // Slower speed (original Pac-Man was about 80ms per move)

    // Movement tracking
    private int pacmanX, pacmanY;
    private int pacmanDirection;
    private int nextDirection; // For buffered inputs
    private int pacmanMouthAngle = 45;
    private boolean mouthOpening = true;

    // Game elements
    private boolean[][] walls;
    private ArrayList<Point> pellets;
    private ArrayList<Ghost> ghosts;
    private int score;
    private Random rand = new Random();
    private boolean gameRunning = true;
    private int ghostSpeedCounter = 0;

    public PacManGame() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);

        // Initialize Pac-Man
        pacmanX = 14;
        pacmanY = 23;
        pacmanDirection = 1;
        nextDirection = 1;

        // Initialize maze
        initializeClassicMaze();

        // Initialize pellets
        pellets = new ArrayList<>();
        for (int i = 1; i < (WIDTH / TILE_SIZE) - 1; i++) {
            for (int j = 1; j < (HEIGHT / TILE_SIZE) - 1; j++) {
                if (!walls[i][j] && !(i == 14 && j == 14)) { // Don't put pellet in ghost house
                    pellets.add(new Point(i, j));
                }
            }
        }

        // Add power pellets
        pellets.add(new Point(1, 3));
        pellets.add(new Point(26, 3));
        pellets.add(new Point(1, 23));
        pellets.add(new Point(26, 23));

        // Initialize ghosts
        ghosts = new ArrayList<>();
        ghosts.add(new Ghost(13, 14, Color.RED, "Blinky", 1)); // Starts outside ghost house
        ghosts.add(new Ghost(14, 14, Color.PINK, "Pinky", 0)); // In ghost house
        ghosts.add(new Ghost(15, 14, Color.CYAN, "Inky", 0)); // In ghost house
        ghosts.add(new Ghost(14, 14, Color.ORANGE, "Clyde", 0)); // In ghost house

        // Timer for animation
        Timer timer = new Timer(DELAY, this);
        timer.start();
    }

    private void initializeClassicMaze() {
        walls = new boolean[WIDTH / TILE_SIZE][HEIGHT / TILE_SIZE];
        int[][] mazeTemplate = {
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,1,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,0,1},
                {1,0,1,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,0,1},
                {1,0,1,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,0,1},
                {1,0,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,0,1},
                {1,0,0,0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,1},
                {1,1,1,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1},
                {1,1,1,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1},
                {1,1,1,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,1,1,1,1,1,1},
                {1,1,1,1,1,1,0,1,1,0,1,1,1,2,2,1,1,1,0,1,1,0,1,1,1,1,1,1},
                {1,1,1,1,1,1,0,1,1,0,1,2,2,2,2,2,2,1,0,1,1,0,1,1,1,1,1,1},
                {0,0,0,0,0,0,0,0,0,0,1,2,2,2,2,2,2,1,0,0,0,0,0,0,0,0,0,0},
                {1,1,1,1,1,1,0,1,1,0,1,2,2,2,2,2,2,1,0,1,1,0,1,1,1,1,1,1},
                {1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1},
                {1,1,1,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,1,1,1,1,1,1},
                {1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1},
                {1,0,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,0,1},
                {1,0,0,0,1,1,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,1,1,0,0,0,1},
                {1,1,1,0,1,1,0,1,1,0,1,1,0,1,1,0,1,1,0,1,1,0,1,1,0,1,1,1},
                {1,1,1,0,1,1,0,1,1,0,1,1,0,1,1,0,1,1,0,1,1,0,1,1,0,1,1,1},
                {1,0,0,0,0,0,0,1,1,0,1,1,0,0,0,0,1,1,0,1,1,0,0,0,0,0,0,1},
                {1,0,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,0,1},
                {1,0,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
        };

        // Convert template to walls (1 = wall, 0 = path, 2 = ghost house)
        for (int y = 0; y < mazeTemplate.length; y++) {
            for (int x = 0; x < mazeTemplate[y].length; x++) {
                walls[x][y] = (mazeTemplate[y][x] == 1);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw maze
        drawMaze(g2d);

        // Draw pellets
        drawPellets(g2d);

        // Draw ghosts
        drawGhosts(g2d);

        // Draw Pac-Man
        drawPacMan(g2d);

        // Draw score
        drawScore(g2d);
    }

    private void drawMaze(Graphics2D g) {
        g.setColor(new Color(33, 33, 255)); // Classic Pac-Man blue
        g.setStroke(new BasicStroke(2));

        for (int x = 0; x < WIDTH / TILE_SIZE; x++) {
            for (int y = 0; y < HEIGHT / TILE_SIZE; y++) {
                if (walls[x][y]) {
                    // Draw walls with rounded corners
                    g.fillRoundRect(x * TILE_SIZE, y * TILE_SIZE,
                            TILE_SIZE, TILE_SIZE, 10, 10);
                }
            }
        }
    }

    private void drawPellets(Graphics2D g) {
        g.setColor(Color.WHITE);
        for (Point pellet : pellets) {
            // Check if it's a power pellet (in the corners)
            if ((pellet.x == 1 && pellet.y == 3) ||
                    (pellet.x == 26 && pellet.y == 3) ||
                    (pellet.x == 1 && pellet.y == 23) ||
                    (pellet.x == 26 && pellet.y == 23)) {
                // Power pellets (larger)
                g.fillOval(pellet.x * TILE_SIZE + 3, pellet.y * TILE_SIZE + 3,
                        TILE_SIZE - 6, TILE_SIZE - 6);
            } else {
                // Regular pellets
                g.fillOval(pellet.x * TILE_SIZE + 8, pellet.y * TILE_SIZE + 8,
                        TILE_SIZE / 5, TILE_SIZE / 5);
            }
        }
    }

    private void drawGhosts(Graphics2D g) {
        for (Ghost ghost : ghosts) {
            // Ghost body
            g.setColor(ghost.color);
            g.fillRoundRect(ghost.x * TILE_SIZE, ghost.y * TILE_SIZE,
                    TILE_SIZE, TILE_SIZE, 20, 20);

            // Ghost bottom waves
            int[] xPoints = new int[6];
            int[] yPoints = new int[6];
            for (int i = 0; i < 6; i++) {
                xPoints[i] = ghost.x * TILE_SIZE + i * (TILE_SIZE / 5);
                yPoints[i] = ghost.y * TILE_SIZE + TILE_SIZE -
                        (i % 2 == 0 ? 0 : TILE_SIZE / 4);
            }
            g.fillPolygon(xPoints, yPoints, 6);

            // Ghost eyes
            g.setColor(Color.WHITE);
            g.fillOval(ghost.x * TILE_SIZE + 5, ghost.y * TILE_SIZE + 5, 8, 8);
            g.fillOval(ghost.x * TILE_SIZE + 15, ghost.y * TILE_SIZE + 5, 8, 8);

            g.setColor(Color.BLUE);
            // Eyes look in movement direction
            int pupilX1 = 6, pupilX2 = 16, pupilY = 6;
            switch (ghost.direction) {
                case 0: pupilY = 6; break; // Up
                case 1: pupilX1 = 7; pupilX2 = 17; break; // Right
                case 2: pupilY = 8; break; // Down
                case 3: pupilX1 = 5; pupilX2 = 15; break; // Left
            }
            g.fillOval(ghost.x * TILE_SIZE + pupilX1, ghost.y * TILE_SIZE + pupilY, 4, 4);
            g.fillOval(ghost.x * TILE_SIZE + pupilX2, ghost.y * TILE_SIZE + pupilY, 4, 4);
        }
    }

    private void drawPacMan(Graphics2D g) {
        g.setColor(Color.YELLOW);

        // Animate mouth opening/closing
        if (mouthOpening) {
            pacmanMouthAngle += 5;
            if (pacmanMouthAngle >= 45) mouthOpening = false;
        } else {
            pacmanMouthAngle -= 5;
            if (pacmanMouthAngle <= 0) mouthOpening = true;
        }

        // Draw Pac-Man with proper mouth direction
        int startAngle = 0;
        switch (pacmanDirection) {
            case 0: startAngle = 270; break; // Up
            case 1: startAngle = 0; break;   // Right
            case 2: startAngle = 90; break;  // Down
            case 3: startAngle = 180; break; // Left
        }

        g.fillArc(pacmanX * TILE_SIZE, pacmanY * TILE_SIZE,
                TILE_SIZE, TILE_SIZE,
                startAngle + pacmanMouthAngle/2,
                360 - pacmanMouthAngle);
    }

    private void drawScore(Graphics2D g) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("SansSerif", Font.BOLD, 20));
        g.drawString("Score: " + score, 20, 30);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!gameRunning) return;

        // Animate Pac-Man's mouth
        animatePacMan();

        // Move Pac-Man
        movePacMan();

        // Move ghosts (slower than Pac-Man)
        ghostSpeedCounter++;
        if (ghostSpeedCounter >= 2) { // Ghosts move at half Pac-Man's speed
            moveGhosts();
            ghostSpeedCounter = 0;
        }

        // Check collisions
        checkPelletCollisions();
        checkGhostCollisions();

        repaint();
    }

    private void animatePacMan() {
        if (mouthOpening) {
            pacmanMouthAngle += 5;
            if (pacmanMouthAngle >= 45) mouthOpening = false;
        } else {
            pacmanMouthAngle -= 5;
            if (pacmanMouthAngle <= 0) mouthOpening = true;
        }
    }

    private void movePacMan() {
        // Try to change direction if there's a buffered input
        if (nextDirection != pacmanDirection) {
            int newX = pacmanX;
            int newY = pacmanY;

            switch (nextDirection) {
                case 0: newY--; break;
                case 1: newX++; break;
                case 2: newY++; break;
                case 3: newX--; break;
            }

            // If the new direction is valid, change direction
            if (!walls[newX][newY]) {
                pacmanDirection = nextDirection;
            }
        }

        // Move in current direction
        int newX = pacmanX;
        int newY = pacmanY;

        switch (pacmanDirection) {
            case 0: newY--; break;
            case 1: newX++; break;
            case 2: newY++; break;
            case 3: newX--; break;
        }

        // Wrap around at tunnels
        if (newX < 0) newX = (WIDTH / TILE_SIZE) - 1;
        if (newX >= WIDTH / TILE_SIZE) newX = 0;

        // Only move if the path is clear
        if (!walls[newX][newY]) {
            pacmanX = newX;
            pacmanY = newY;
        }
    }

    private void moveGhosts() {
        for (Ghost ghost : ghosts) {
            // Ghost AI - different behaviors for each ghost
            int desiredDirection = ghost.direction;

            // Blinky (red) - chases directly
            if (ghost.name.equals("Blinky")) {
                desiredDirection = chasePacMan(ghost, false);
            }
            // Pinky (pink) - targets 4 tiles ahead of Pac-Man
            else if (ghost.name.equals("Pinky")) {
                desiredDirection = chasePacMan(ghost, true);
            }
            // Inky (cyan) - more complex pattern
            else if (ghost.name.equals("Inky")) {
                if (rand.nextDouble() < 0.7) {
                    desiredDirection = chasePacMan(ghost, false);
                } else {
                    desiredDirection = rand.nextInt(4);
                }
            }
            // Clyde (orange) - random but leaves player alone when close
            else if (ghost.name.equals("Clyde")) {
                double distance = Math.sqrt(Math.pow(ghost.x - pacmanX, 2) +
                        Math.pow(ghost.y - pacmanY, 2));
                if (distance > 8) {
                    desiredDirection = chasePacMan(ghost, false);
                } else {
                    desiredDirection = rand.nextInt(4);
                }
            }

            // Try to move in desired direction
            int newX = ghost.x;
            int newY = ghost.y;

            switch (desiredDirection) {
                case 0: newY--; break;
                case 1: newX++; break;
                case 2: newY++; break;
                case 3: newX--; break;
            }

            // If desired direction is valid, move that way
            if (!walls[newX][newY]) {
                ghost.x = newX;
                ghost.y = newY;
                ghost.direction = desiredDirection;
                continue;
            }

            // Otherwise try to continue current direction
            newX = ghost.x;
            newY = ghost.y;

            switch (ghost.direction) {
                case 0: newY--; break;
                case 1: newX++; break;
                case 2: newY++; break;
                case 3: newX--; break;
            }

            // If can continue current direction
            if (!walls[newX][newY]) {
                ghost.x = newX;
                ghost.y = newY;
                continue;
            }

            // Otherwise choose random valid direction
            ArrayList<Integer> possibleDirections = new ArrayList<>();
            if (!walls[ghost.x][ghost.y - 1]) possibleDirections.add(0);
            if (!walls[ghost.x + 1][ghost.y]) possibleDirections.add(1);
            if (!walls[ghost.x][ghost.y + 1]) possibleDirections.add(2);
            if (!walls[ghost.x - 1][ghost.y]) possibleDirections.add(3);

            if (!possibleDirections.isEmpty()) {
                int dir = possibleDirections.get(rand.nextInt(possibleDirections.size()));
                ghost.direction = dir;

                newX = ghost.x;
                newY = ghost.y;
                switch (dir) {
                    case 0: newY--; break;
                    case 1: newX++; break;
                    case 2: newY++; break;
                    case 3: newX--; break;
                }
                ghost.x = newX;
                ghost.y = newY;
            }
        }
    }

    private int chasePacMan(Ghost ghost, boolean targetAhead) {
        int targetX = pacmanX;
        int targetY = pacmanY;

        if (targetAhead) {
            // Target 4 tiles ahead of Pac-Man's direction
            switch (pacmanDirection) {
                case 0: targetY -= 4; break;
                case 1: targetX += 4; break;
                case 2: targetY += 4; break;
                case 3: targetX -= 4; break;
            }
        }

        // Find which direction gets ghost closer to target
        int bestDir = ghost.direction;
        double minDist = Double.MAX_VALUE;

        for (int dir = 0; dir < 4; dir++) {
            int newX = ghost.x;
            int newY = ghost.y;

            switch (dir) {
                case 0: newY--; break;
                case 1: newX++; break;
                case 2: newY++; break;
                case 3: newX--; break;
            }

            if (!walls[newX][newY]) {
                double dist = Math.pow(newX - targetX, 2) + Math.pow(newY - targetY, 2);
                if (dist < minDist) {
                    minDist = dist;
                    bestDir = dir;
                }
            }
        }

        return bestDir;
    }

    private void checkPelletCollisions() {
        for (int i = 0; i < pellets.size(); i++) {
            if (pacmanX == pellets.get(i).x && pacmanY == pellets.get(i).y) {
                pellets.remove(i);
                score += 10;

                // Check if all pellets are eaten
                if (pellets.isEmpty()) {
                    gameRunning = false;
                    JOptionPane.showMessageDialog(this, "You Win! Final Score: " + score);
                }
                break;
            }
        }
    }

    private void checkGhostCollisions() {
        for (Ghost ghost : ghosts) {
            if (pacmanX == ghost.x && pacmanY == ghost.y) {
                gameRunning = false;
                JOptionPane.showMessageDialog(this,
                        "Game Over! " + ghost.name + " got you! Final Score: " + score);
                break;
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP: nextDirection = 0; break;
            case KeyEvent.VK_RIGHT: nextDirection = 1; break;
            case KeyEvent.VK_DOWN: nextDirection = 2; break;
            case KeyEvent.VK_LEFT: nextDirection = 3; break;
        }
    }

    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}

    private class Ghost {
        int x, y;
        int direction;
        Color color;
        String name;
        int mode; // 0 = in ghost house, 1 = chasing, etc.

        public Ghost(int x, int y, Color color, String name, int mode) {
            this.x = x;
            this.y = y;
            this.color = color;
            this.name = name;
            this.mode = mode;
            this.direction = rand.nextInt(4);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Classic Pac-Man");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(new PacManGame());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}