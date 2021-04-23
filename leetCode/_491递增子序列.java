import org.junit.Test;

import java.util.*;

public class _491递增子序列 {

    List<List<Integer>> ans;
    Deque<Integer> path;

    @Test
    public void test() {
        int[] t = {4, 6, 7, 7};
        findSubsequences(t);
    }

    public List<List<Integer>> findSubsequences(int[] nums) {
        ans = new ArrayList<>();
        if (nums == null || nums.length < 1) return ans;
        path = new ArrayDeque<>();
        Arrays.sort(nums);
        recur(nums, 0);
        return ans;
    }
    private void recur(int[] nums, int start) {
        if (!path.isEmpty()) {
            ans.add(new ArrayList<>(path));
        }
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            path.push(nums[i]);
            recur(nums, i + 1);
            path.pop();
        }
    }
}
