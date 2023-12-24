package game;

import util.TextUtil;

import java.util.Scanner;

public class Game {

    private char[][] board;
    private Scanner scanner;

    public Game(char[][] board, Scanner scanner) {
        this.scanner = scanner;
        this.board = board;
    }

    public void start() {
        TextUtil.printBoard(board);
        TextUtil.showMainMenu();

        String choice = scanner.nextLine();
        while (true) {
            switch (choice) {
                case "1" -> GameWithFriend.play(board, scanner);
                case "2" -> GameWithComputer.play(board, scanner);
                case "0" -> {
                    System.out.println("Back");
                    return;
                }
                default -> {
                    System.out.println("Wrong input !!!");
                }
            }
        }

    }

    public static boolean checkWin(char[][] board, char player) {
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }

}