import org.junit.Test;

public class _238除自身以外的乘积 {
    public int[] productExceptSelf(int[] nums) {
        int len, tmp = 1;
        if (nums == null || (len = nums.length) < 1) return new int[0];
        int[] ans = new int[len];
        ans[0] = 1;
        for (int i = 1; i < len; i++) {
            tmp = tmp * nums[i - 1];
            ans[i] = tmp;
        }
        tmp = 1;
        for (int i = len - 2; i >= 0; i--) {
            tmp = tmp * nums[i + 1];
            ans[i] *= tmp;
        }
        return ans;
    }

    @Test
    public void test() {
        int[] tt = {1, 2, 3, 4};
        productExceptSelf(tt);
    }
}
