import org.junit.Test;

public class _45跳跃游戏2 {

    public int jump(int[] nums) {
        int curMax = nums[0], nextMax = 0, ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (curMax >= nums.length - 1) break;
//            nextMax = Math.max(nextMax, i + nums[i]);
            for (int j = i + 1; j <= curMax; j++) {
                nextMax = Math.max(nextMax, j + nums[j]);
            }
            if (curMax < nums.length - 1) {
                ans++;
                curMax = nextMax;
            }
        }
        return ans + 1;
    }

    @Test
    public void test() {
//        int[] t = {2,3,1,1,4};
//        int[] t = {1,2,1,1,1};
//        int[] t = {0};
        int[] t = {2,1};
        int jump = jump(t);
        System.out.println(jump);
    }
}
