import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1两数之和 {

/*    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 1) return new int[0];
        Arrays.sort(nums);
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int sum = nums[low] + nums[high];
            if (sum == target) return new int[] {low, high};
            else if (sum > target) high--;
            else low++;
        }
        return new int[0];
    }*/

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 1) return new int[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) return new int[] {map.get(target - nums[i]), i};
            map.put(nums[i], i);
        }
        return new int[0];
    }

    @Test
    public void test() {
        int[] t = {3, 2, 4};
        int[] ints = twoSum(t, 7);
    }
}
