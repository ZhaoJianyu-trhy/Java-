package leetCode;

import org.junit.Test;

public class _17 {
    int n, index;
    int[] ans;
    char[] tmp, loop = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public void dfs(int x) {
        if (x == n) {
            ans[index++] = Integer.parseInt(new String(tmp));
            return;
        }
        for (char c : loop) {
            tmp[x] = c;
            dfs(x + 1);
        }
    }

    @Test
    public void test1() {
        int a = 012;
        System.out.println(a);
    }

    @Test
    public void test() {
        this.n = 2;
        ans = new int[(int) Math.pow(10, 2)];
        tmp = new char[n];
        dfs(0);
        int format = 0;
        for (int n : ans) {
            if (format == 10) {
                System.err.println(n);
                format = 0;
            } else {
                if (n < 10) System.err.print(n + "  ");
                else System.err.print(n + " ");
                format++;
            }
        }
    }
}
