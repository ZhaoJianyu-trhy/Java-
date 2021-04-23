import org.junit.Test;

import java.util.*;

public class _90子集2 {

    List<List<Integer>> ans;
    Deque<Integer> path;
    boolean[] isVisted;

    @Test
    public void test() {
        int[] t = {1, 2, 2};
        subsetsWithDup(t);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans = new ArrayList<>();
        if (nums == null || nums.length < 1) return ans;
        Arrays.sort(nums);
        path = new LinkedList<>();
        isVisted = new boolean[nums.length];
        recur(nums, 0);
        return ans;
    }
    private void recur(int[] nums, int start) {
        ans.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !isVisted[i - 1]) continue;
            isVisted[i] = true;
            path.add(nums[i]);
            recur(nums, i + 1);
            isVisted[i] = false;
            path.removeLast();
        }
    }
}
