package 背包问题;

import org.junit.Test;

public class _279完全平方数 {

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) dp[i] = Integer.MAX_VALUE;
        for (int i = 0; i * i <= n; i++) {
            for (int j = i * i; j <= n; j++) {
                if (dp[j - i * i] == Integer.MAX_VALUE) continue;
                dp[j] = Math.min(dp[j], dp[j - i * i] + 1);
            }
        }
        return dp[n];
    }

    @Test
    public void test() {
        System.out.println("numSquares(12) = " + numSquares(12));
    }
}
