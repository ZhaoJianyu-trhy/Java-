public class _209 {

    public static void main(String[] args) {
        _209 v = new _209();
        int[] test = {2,3,1,2,4,3};
        int target = 7;
        int ans = v.minSubArrayLen(target, test);
        System.out.println(ans);
    }
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length < 1 || s < 1) return 0;
        //用窗口来解，我的窗口是左闭右闭
        int i = 0, j = 0, ans = Integer.MAX_VALUE, sum = nums[0];
        while (i <= nums.length - 1) {
            if (sum >= s) {
                ans = Math.min(ans, j + 1 - i);
                sum -= nums[i];
                i++;
            }
            if (++j > nums.length - 1) break;
            sum += nums[j];
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
