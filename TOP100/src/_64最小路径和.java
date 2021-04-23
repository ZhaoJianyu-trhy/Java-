import org.junit.Test;

public class _64最小路径和 {

    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length + 1][grid[0].length + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp.length; j++) {
                dp[i][j] = grid[i - 1][j - 1] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[grid.length][grid[0].length];
    }

    @Test
    public void test() {
        int[][] t = {
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        System.out.println("minPathSum(t) = " + minPathSum(t));
    }
}
