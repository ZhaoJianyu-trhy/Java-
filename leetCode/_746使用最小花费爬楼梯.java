import org.junit.Test;

public class _746使用最小花费爬楼梯 {

    public int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length < 1) return 0;
        int[] dp = new int[cost.length];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return Math.min(dp[dp.length - 1] + cost[cost.length - 1], dp[dp.length - 2] + cost[cost.length - 2]);
    }

    @Test
    public void test() {
        int[] t = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int i = minCostClimbingStairs(t);
        System.out.println(i);
    }
}
