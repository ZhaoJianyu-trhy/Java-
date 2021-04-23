package 背包问题;

import org.junit.Test;

public class _416分割等和子集 {

    @Test
    public void test() {
        int[] nums = {1, 5, 11, 5};
        System.out.println("canPartition(nums) = " + canPartition(nums));
    }

    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length < 1) return false;
        int len = nums.length, check = 0, target = 0;
        for (int n : nums) {
            check += n;
        }
        if ((check & 1) == 1) return false;
        target = check >>> 1;
        boolean[][] dp = new boolean[len][target + 1];
        for (int i = 1; i <= target; i++) {
            if (nums[0] == target) dp[0][i] = true;
        }
        for (int i = 1; i < len; i++) {
            for (int j = 1; j <= target; j++) {
                if (j < nums[i]) dp[i][j] = dp[i - 1][j];
                else if (j == nums[i]) dp[i][j] = true;
                else dp[i][j] = dp[i - 1][j - nums[i]] || dp[i - 1][j];
            }
        }
        for (boolean[] b : dp) {
            for (boolean bb : b) {
                System.out.print(bb + " ");
            }
            System.out.println();
        }
        return dp[len - 1][target];
    }
}
