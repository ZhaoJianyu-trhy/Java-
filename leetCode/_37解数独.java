import org.junit.Test;

import java.util.Arrays;

public class _37解数独 {

    public void solveSudoku(String[][] board) {
        if (board == null || board.length < 1) return;
        backTracking(board);
    }

    private boolean backTracking(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!board[i][j].equals(".")) continue;
                for (char k = '1'; k <= '9'; k++) {
                    if (!isvalidate(board, i, j, String.valueOf(k))) continue;
                    board[i][j] = String.valueOf(k);
                    if (backTracking(board)) return true;
                    board[i][j] = ".";
                }
                //这里返回false的话，怎么去到上一上呢?
                return false;
            }
        }
        return true;
    }

    private boolean isvalidate(String[][] board, int row, int column, String k) {
        //检查同一列
        for (int i = 0; i < board.length; i++) {
            if (i == row) continue;
            if (board[i][column].equals(k)) return false;
        }
        //检查同一行
        for (int i = 0; i < board[0].length; i++) {
            if (i == column) continue;
            if (board[row][i].equals(k)) return false;
        }
        //检查同一个矩形块，如果能找到每个小矩形的左下位置坐标，就容易检查了
        int startRow = row / 3 * 3, startColumn = column / 3 * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            if (i == row) continue;
            for (int j = startColumn; j < startColumn + 3; j++) {
                if (j == column) continue;
                if (board[i][j].equals(k)) return false;
            }
        }
        return true;
    }

    @Test
    public void test() {
/*        String[][] board = {
                {"5","3",".",".","7",".",".",".","."},
                {"6",".",".","1","9","5",".",".","."},{".","9","8",".",".",".",".","6","."},
                {"8",".",".",".","6",".",".",".","3"},{"4",".",".","8",".","3",".",".","1"},
                {"7",".",".",".","2",".",".",".","6"},{".","6",".",".",".",".","2","8","."},
                {".",".",".","4","1","9",".",".","5"},{".",".",".",".","8",".",".","7","9"},
        };*/
//        String[][] board = {
//                {"1","2","3","4","5","6","7","8","9"},
//                {"6",".",".","1","9","5",".",".","."},{".","9","8",".",".",".",".","6","."},
//                {"8",".",".",".","6",".",".",".","3"},{"4",".",".","8",".","3",".",".","1"},
//                {"7",".",".",".","2",".",".",".","6"},{".","6",".",".",".",".","2","8","."},
//                {".",".",".","4","1","9",".",".","5"},{".",".",".",".","8",".",".","7","9"},
//        };
        String[][] board = {
                {".",".",".",".",".",".",".",".","."},
                {".",".",".",".",".",".",".",".","."},{".",".",".",".",".",".",".",".","."},
                {".",".",".",".",".",".",".",".","."},{".",".",".",".",".",".",".",".","."},
                {".",".",".",".",".",".",".",".","."},{".",".",".",".",".",".",".",".","."},
                {".",".",".",".",".",".",".",".","."},{".",".",".",".",".",".",".",".","."}
        };
        solveSudoku(board);
        for (String[] s : board) {
            System.out.println(Arrays.toString(s));
        }
    }
}
