import java.util.LinkedList;

public class _12 {
    String myWord;
    char[] required;
    public boolean exist(char[][] board, String word) {
        myWord = word;
        if (board == null || board.length < 1 || word == null || word.length() < 1) return false;
        required = word.toCharArray();
        boolean[][] isVisted = new boolean[board.length][board[0].length];
        LinkedList<Character> check = new LinkedList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (recur(board, isVisted, i, j, check, 0)) return true;
            }
        }
        return false;
    }
    private boolean recur(char[][] board, boolean[][] isVisted, int i, int j, LinkedList<Character> check, int k) {
        //设置返回条件
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || isVisted[i][j] || board[i][j] != required[k]) return false;
        check.add(required[k]);
        if (check.size() == required.length) return true;
        //将当前字符设置为已访问
        isVisted[i][j] = true;
        boolean ans = recur(board, isVisted, i + 1, j, check, k + 1) || recur(board, isVisted, i - 1, j,  check, k + 1) || recur(board, isVisted, i, j + 1, check, k + 1) || recur(board, isVisted, i, j - 1, check, k + 1);
        isVisted[i][j] = false;
        return ans;
    }

    public static void main(String[] args) {
        char[][] board = {{'a', 'a'}};
        String word = "aaa";
        System.out.println(new _12().exist(board, word));
    }
}
