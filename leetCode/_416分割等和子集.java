import org.junit.Test;

public class _416分割等和子集 {

    boolean ans;

    /**
     * 回溯版本
     * @param nums
     * @return
     */
    public boolean canPartition(int[] nums) {
        int len, sum = 0, target;
        ans = false;
        if (nums == null || (len = nums.length) < 1) return false;
        for (int n : nums) sum += n;
        if ((sum & 1) == 1) return false;
        target = sum >>> 1;
        recur(nums, 0, 0, target);
        return ans;
    }
    private void recur(int[] nums, int step, int sum, int target) {
        if (step >= nums.length) return;
        if (sum == target) {
            ans = true;
            return;
        }
        for (int i = step; i < nums.length; i++) {
            recur(nums, i + 1, sum + nums[i], target);
            if (ans) return;
        }
    }

    @Test
    public void test() {
//        int[] nums = {1, 5, 11, 5};
//        int[] nums = {1, 2, 5};
//        int[] nums = {1, 2, 3, 5};
        int[] nums = {100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,99,97};
        System.out.println("canPartition(nums) = " + canPartition(nums));
    }
}
