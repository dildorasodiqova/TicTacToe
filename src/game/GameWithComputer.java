package game;

import java.util.Scanner;

import static game.Board.isBoardFull;
import static game.Game.checkWin;
import static util.TextUtil.printBoard;

public class GameWithComputer {

    public static void play(char[][] board, Scanner scanner) {
        char currentPlayer = 'X';
        boolean gameWon = false;

        while (!gameWon) {
            if (currentPlayer == 'X') {
                Board.makeMove(board, currentPlayer, scanner);
            } else {
                Board.makeComputerMove(board);
            }

            printBoard(board);

            if (checkWin(board, currentPlayer)) {
                if (currentPlayer == 'X') {
                    System.out.println("Player " + currentPlayer + " wins!");
                } else {
                    System.out.println("Computer wins!");
                }
                gameWon = true;
            } else if (isBoardFull(board)) {
                System.out.println("It's a draw!");
                gameWon = true;
            }
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }

}
