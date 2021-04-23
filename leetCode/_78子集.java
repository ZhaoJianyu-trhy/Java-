import com.sun.org.apache.bcel.internal.generic.FSUB;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _78子集 {

    List<List<Integer>> ans;
    LinkedList<Integer> path;

    @Test
    public void test() {
        int[] t = {1, 2, 3};
        subsets(t);
    }

    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        if (nums == null || nums.length < 1) return ans;
        path = new LinkedList<>();
        recur(nums, 0);
        return ans;
    }
    private void recur(int[] nums, int start) {
        ans.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            recur(nums, i + 1);
            path.removeLast();
        }
    }
}
