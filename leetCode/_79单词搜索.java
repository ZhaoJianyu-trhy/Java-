import org.junit.Test;

import java.util.Arrays;

public class _79单词搜索 {

    boolean[][] isVisted;
    char[] str;
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length < 1) return false;
        isVisted = new boolean[board.length][board[0].length];
        str = new char[word.length()];
        Arrays.fill(str, '!');
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (recur(board, i, j, 0, word)) return true;
            }
        }
        return false;
    }
    private boolean recur(char[][] board, int i, int j, int step, String word) {
        if (step == word.length()) {
            if (String.valueOf(str).equals(word)) return true;
            else return false;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || isVisted[i][j]) return false;
        isVisted[i][j] = true;
        str[step] = board[i][j];
        boolean isFound = recur(board, i - 1, j, step + 1,word) || recur(board, i + 1, j, step + 1, word) || recur(board, i, j - 1, step + 1, word) || recur(board, i, j + 1, step + 1, word);
        str[step] = ' ';
        isVisted[i][j] = false;
        return isFound;
    }

    @Test
    public void test() {
        String boardHandle = "123";
        boardHandle.replace("1", "!");
        System.out.println(boardHandle);
    }

    @Test
    public void handleBoard() {
        String leetcode = "[[\"b\",\"a\",\"a\",\"b\",\"a\",\"b\"],[\"a\",\"b\",\"a\",\"a\",\"a\",\"a\"],[\"a\",\"b\",\"a\",\"a\",\"a\",\"b\"],[\"a\",\"b\",\"a\",\"b\",\"b\",\"a\"],[\"a\",\"a\",\"b\",\"b\",\"a\",\"b\"],[\"a\",\"a\",\"b\",\"b\",\"b\",\"a\"],[\"a\",\"a\",\"b\",\"a\",\"a\",\"b\"]]";
        leetcode.replaceAll("\\[", "{");
        leetcode.replaceAll("]", "}");
        System.out.println(leetcode);
    }
}
