package util;

public class TextUtil {
    public static void showMainMenu() {
        System.out.println("Choose:");
        System.out.println("1. Two Players");
        System.out.println("2. Against Computer");
        System.out.println("0. Back");
    }

    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) System.out.print(board[i][j] + " | ");
            System.out.println();
            System.out.println("-------------");
        }
    }
}
