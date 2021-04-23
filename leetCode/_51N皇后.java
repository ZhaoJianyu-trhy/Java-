import org.junit.Test;

import java.util.*;

public class _51N皇后 {

    List<List<String>> ans;
    Set<Integer> check;
    int limit;
    public List<List<String>> solveNQueens(int n) {
        ans = new ArrayList<>();
        if (n < 1) return ans;
        limit = n;
        check = new HashSet<>();
        boolean[][] qipan = new boolean[n + 1][n + 1];
        recur(qipan, 1);
        return ans;
    }
    private void recur(boolean[][] qipan, int i) {
        if (i > limit) {
            getAns(qipan);
            return;
        }
        for (int j = 1; j <= limit; j++) {
            if (check.contains(j) || check.contains(j + 1) || check.contains(j - 1)) continue;
            //用于标记可安放的结果，方便getAns()函数使用
            qipan[i][j] = true;
            check.add(j);
            recur(qipan, i + 1);
            qipan[i][j] = false;
            check.remove(j);
        }
    }
    private void getAns(boolean[][] qipan) {
        LinkedList<String> tmp = new LinkedList<>();
        for (int i = 1; i <= limit; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 1; j <= limit; j++) {
                if (qipan[i][j] == true) str.append("Q");
                else str.append(".");
            }
            tmp.addLast(str.toString());
        }
        ans.add(tmp);
    }

    @Test
    public void test() {
        int t = 4;
        solveNQueens(t);
    }
}
