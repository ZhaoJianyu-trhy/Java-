public class _13 {
    int ans, row, column;
    boolean[][] isVisted;
    public int movingCount(int m, int n, int k) {
        ans = 0; row = m; column = n;
        isVisted = new boolean[m][n];
        if (row < 0) return ans;
        recur(0, 0, k);
        return ans;
    }
    private void recur(int m, int n, int k) {
        if (m >= row || n >= column || isVisted[m][n]) return;
        if (check(m, n, k)) ans++;
        isVisted[m][n] = true;
        recur(m + 1, n, k);
        recur(m, n + 1, k);
    }
    private boolean check(int m, int n, int k) {
        if ((sum(m) + sum(n)) > k) return false;
        return true;
    }
    private int sum(int n) {
        int ans = 0;
        while (n > 0) {
            ans += n % 10;
            n /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        _13 v = new _13();
        System.out.println(v.movingCount(11, 1, 4));
    }
}
