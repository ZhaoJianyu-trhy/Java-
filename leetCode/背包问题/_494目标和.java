package 背包问题;

import org.junit.Test;

public class _494目标和 {

    public int findTargetSumWays(int[] nums, int S) {
        int target = 0, len;
        if (nums == null || (len = nums.length) < 1) return 0;
        for (int n : nums) target += n;
        if (S > target) return 0;
        target = (target + S) >>> 1;
        if ((target & 1) == 1) return 0;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 0; i < len; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[target];
    }

    @Test
    public void test() {
        int[] nums = {1};
        int S = 1;
        findTargetSumWays(nums, S);
    }
}
