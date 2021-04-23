import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _46全排列 {

    List<List<Integer>> ans;

    @Test
    public void test() {
        int[] t = {1, 2, 3};
        permute(t);
    }

    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        if (nums == null || nums.length < 1) return ans;
        recur(nums, 0);
        return ans;
    }
    private void recur(int[] nums, int start) {
        if (start == 3) {
            List<Integer> list = new ArrayList<>();
            for (int n : nums) list.add(n);
            ans.add(list);
            return;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            if (set.contains(nums[i])) continue;
            set.add(nums[i]);
            swap(nums, start, i);
            recur(nums, i + 1);
            swap(nums, i, start);
        }
    }
    private void swap(int[] nums, int low, int high) {
        int tmp = nums[low];
        nums[low] = nums[high];
        nums[high] = tmp;
    }
}
