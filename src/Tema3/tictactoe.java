package Tema3;
import java.util.Random;
import java.util.Scanner;
public class tictactoe {
    static char[][] board = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
    };
    static char currentPlayer = 'X';
    static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard();
            if (currentPlayer == 'X') {
                playerMove(scanner);
            } else {
                botMove();
            }

            if (checkWin()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            } else if (isBoardFull()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }

            // Switch player
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
        scanner.close();
    }

    public static void printBoard() {
        System.out.println("\nCurrent board:");
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static void playerMove(Scanner scanner) {
        int move;
        while (true) {
            System.out.print("Enter your move (1-9): ");
            move = scanner.nextInt();
            if (isValidMove(move)) {
                break;
            }
            System.out.println("Invalid move, try again.");
        }
        placeMove(move, currentPlayer);
    }

    public static void botMove() {
        int move;
        while (true) {
            move = random.nextInt(9) + 1; // Random move between 1 and 9
            if (isValidMove(move)) {
                break;
            }
        }
        System.out.println("Bot chooses " + move);
        placeMove(move, currentPlayer);
    }

    public static boolean isValidMove(int move) {
        switch (move) {
            case 1: return board[0][0] == '1';
            case 2: return board[0][1] == '2';
            case 3: return board[0][2] == '3';
            case 4: return board[1][0] == '4';
            case 5: return board[1][1] == '5';
            case 6: return board[1][2] == '6';
            case 7: return board[2][0] == '7';
            case 8: return board[2][1] == '8';
            case 9: return board[2][2] == '9';
            default: return false;
        }
    }

    public static void placeMove(int move, char player) {
        switch (move) {
            case 1: board[0][0] = player; break;
            case 2: board[0][1] = player; break;
            case 3: board[0][2] = player; break;
            case 4: board[1][0] = player; break;
            case 5: board[1][1] = player; break;
            case 6: board[1][2] = player; break;
            case 7: board[2][0] = player; break;
            case 8: board[2][1] = player; break;
            case 9: board[2][2] = player; break;
        }
    }

    public static boolean checkWin() {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != 'X' && board[i][j] != 'O') {
                    return false;
                }
            }
        }
        return true;
        }
    }
