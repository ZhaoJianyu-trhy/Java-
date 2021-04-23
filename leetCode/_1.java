package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] ints = twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) return new int[0];
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) map.put(nums[i], i);
            else if (2 * nums[i] == target) {
                ans[0] = map.get(nums[i]);
                ans[1] = i;
                return ans;
            }
        }
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            int check = nums[i];
            if (map.containsKey(target -  check)) {
                flag = true;
                ans[0] = i;
                ans[1] = map.get(target - check);
                break;
            }
        }
        return flag ? ans : new int[0];
    }
}
