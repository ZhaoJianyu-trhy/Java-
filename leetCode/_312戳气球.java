import org.junit.Test;

public class _312戳气球 {
    private int len;
    private int[] val;
    private int[][] ans;

    public int maxCoins(int[] nums) {
        if (nums == null || (len = nums.length) < 1) return 0;
        len = len + 2;
        val = new int[len];
        ans = new int[len][len];
        for (int i = 1; i < len - 1; i++) {
            val[i] = nums[i - 1];
        }
        val[0] = val[len - 1] = 1;
        return getAns(0, len - 1);
    }

    private int getAns(int low, int high) {
        if (high - low <= 1) {
            return 0;
        }
        if (ans[low][high] != 0) {
            return ans[low][high];
        }
        for (int i = low + 1; i < high; i++) {
            int curVal = val[low] * val[i] * val[high];
            curVal += getAns(low, i) + getAns(i, high);
            ans[low][high] = Math.max(ans[low][high], curVal);
        }
        return ans[low][high];
    }

    @Test
    public void test() {
//        int[] t = {3,1,5,8};
        int[] t = {8,2,6,8,9,8,1,4,1,5,3,0,7,7,0,4,2,2,5};
        System.out.println(maxCoins(t));
    }
}
