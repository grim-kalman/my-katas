package dataStructures.tickTackToeChecker;

import java.util.Arrays;

public class TickTackToeChecker {


    public static int isSolved(int[][] board) {
        if (hasWon(board, 1)) {
            return 1;
        } else if (hasWon(board, 2)) {
            return 2;
        } else if (isBoardFull(board)) {
            return 0;
        } else {
            return -1;
        }
    }

    private static boolean hasWon(int[][] board, int player) {
        int[][] rotatedBoard = transpose(board);
        String playerSymbol = (player == 1) ? "1" : "2";

        for (int i = 0; i < 3; i++) {
            if (Arrays.equals(board[i], new int[]{player, player, player}) ||
                    Arrays.equals(rotatedBoard[i], new int[]{player, player, player})) {
                return true;
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        return board[0][2] == player && board[1][1] == player && board[2][0] == player;
    }

    private static int[][] transpose(int[][] array) {
        int width = array.length;
        int height = array[0].length;
        int[][] newArray = new int[height][width];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                newArray[y][x] = array[x][y];
            }
        }
        return newArray;
    }

    private static boolean isBoardFull(int[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
