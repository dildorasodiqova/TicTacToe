package game;

import java.util.Random;
import java.util.Scanner;


public class Board {
    public static void makeMove(char[][] board, char currentPlayer, Scanner scanner) {
        int row, col;

        do {
            System.out.print("Player " + currentPlayer + ", enter your move row :  ");
            row = scanner.nextInt();
            System.out.print("Player " + currentPlayer + ", enter your move col :  ");
            col = scanner.nextInt();
        } while (isValidMove(board, row, col));

        board[row][col] = currentPlayer;
    }

    public static void makeComputerMove(char[][] board) {
        Random random = new Random();
        int row, col;

        do {
            row = random.nextInt(3);
            col = random.nextInt(3);
        } while (isValidMove(board, row, col));
        board[row][col] = 'O';
    }

    public static boolean isValidMove(char[][] board, int row, int col) {
        return (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ');
    }

    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

}
