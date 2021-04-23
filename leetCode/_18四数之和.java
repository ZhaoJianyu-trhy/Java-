import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _18四数之和 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 1) return new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < len - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if (nums[i] + nums[len - 1] + nums[len - 2] + nums[len - 3] < target) continue;
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break;;
            for (int j = i + 1; j < len - 2; j++) {
                if (j > 0 && nums[j] == nums[j - 1]) continue;
                if (nums[i] + nums[j] + nums[len - 1] + nums[len - 2] < target) continue;
                if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break;
                int low = j + 1, high = len - 1;
                while (low < high) {
                    int sum = nums[i] + nums[j] + nums[low] + nums[high];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        high--;
                        while (low < high && nums[high] == nums[high + 1]) high--;
                        low++;
                        while (low < high && nums[low] == nums[low - 1]) low++;
                    } else if (sum > target) {
                        high--;
                        while (low < high && nums[high] == nums[high + 1]) high--;
                    } else {
                        low++;
                        while (low < high && nums[low] == nums[low - 1]) low++;
                    }
                }
            }
        }
        return ans;
    }

    @Test
    public void test() {
        int[] nums = {1,0,-1,0,-2,2};
        System.out.println(fourSum(nums, 0));
    }
}
