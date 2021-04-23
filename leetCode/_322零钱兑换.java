import org.junit.Test;

public class _322零钱兑换 {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1; i < dp.length; i++) dp[i] = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                if (dp[j - coins[i]] == Integer.MAX_VALUE) continue;
                dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
            }
        }
        return (dp[amount] == Integer.MAX_VALUE) ? -1 : dp[amount];
    }

    @Test
    public void test() {
        int[] coins = {1, 2, 5};
        coinChange(coins, 11);
    }
}
