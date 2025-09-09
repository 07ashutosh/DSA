import java.util.ArrayList;
import java.util.List;

public class l13_backtracking {

    // check if safe to place a queen
    public boolean isSafe(int row, int col, char[][] board) {
        // horizontal
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // vertical
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // upper left
        int r = row, c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q')
                return false;
            r--;
            c--;
        }

        // upper right
        r = row;
        c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c] == 'Q')
                return false;
            r--;
            c++;
        }

        // lower left
        r = row;
        c = col;
        while (r < board.length && c >= 0) {
            if (board[r][c] == 'Q')
                return false;
            r++;
            c--;
        }

        // lower right
        r = row;
        c = col;
        while (r < board.length && c < board.length) {
            if (board[r][c] == 'Q')
                return false;
            r++;
            c++;
        }

        return true;
    }

    // save the board
    public void saveBoard(char[][] board, List<List<String>> allBoard) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = "";
            for (int j = 0; j < board[0].length; j++) {
                row += (board[i][j] == 'Q') ? 'Q' : '.';
            }
            newBoard.add(row);
        }
        allBoard.add(newBoard);
    }

    // backtracking helper
    public void helper(char[][] board, List<List<String>> allBoard, int col) {
        if (col == board.length) {
            saveBoard(board, allBoard);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoard, col + 1);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    // solve N-Queens
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoard = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        helper(board, allBoard, 0);
        return allBoard;
    }

    public static void main(String[] args) {
        l13_backtracking solver = new l13_backtracking();
        int n = 4;
        List<List<String>> solutions = solver.solveNQueens(n);

        int count = 1;
        for (List<String> board : solutions) {
            System.out.println("Solution " + count + ":");
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
            count++;
        }
    }
}
