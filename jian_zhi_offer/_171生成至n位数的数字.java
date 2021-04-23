import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class _171生成至n位数的数字 {
    private final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private int n;
    char[] tmp;
    List<String> path;
    public void printNumbers(int n) {
        tmp = new char[n];
        path = new ArrayList<String>();
        this.n = n;
        int index = 0;
        dfs(0);
        for (String str : path) {
            System.out.print(str + " ");
            if (++index == 10) {
                System.out.println();
                index = 0;
            }
        }
    }
    private void dfs(int index) {
        if (index == n) {
            path.add(new String(tmp));
            return;
        }
        for (char ch : c) {
            tmp[index] = ch;
            dfs(index + 1);
        }
    }

    @Test
    public void test() {
        printNumbers(2);
    }
}
