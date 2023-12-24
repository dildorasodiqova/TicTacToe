package game;

import java.util.Scanner;

import static game.Board.isBoardFull;
import static game.Board.makeMove;
import static game.Game.checkWin;
import static util.TextUtil.printBoard;

public class GameWithFriend {
    public static void play(char[][] board, Scanner scanner) {
        char currentPlayer = 'X';
        boolean gameWon = false;

        while (!gameWon) {
            makeMove(board, currentPlayer, scanner);
            printBoard(board);

            if (checkWin(board, currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                gameWon = true;
            } else if (isBoardFull(board)) {
                System.out.println("It's a draw!");
                gameWon = true;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }
}