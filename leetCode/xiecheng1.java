import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class xiecheng1 {
    int ans;
    List<List<Integer>> list;
    List<Integer> path;
    @Test
    public void count() {
        ans = 0;
        int[] nums = {6,2,5,5,3,7,3,1,1,4,4,8,8};
        list = new ArrayList<>();
        path = new ArrayList<>();
        backRecur(nums, 0, 0, 10);
        System.out.println(ans);
    }
    private void backRecur(int[] nums, int start, int cur, int target) {
        if (cur > target) {
            return;
        }
        if (cur == target) {
            ans++;
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (!path.isEmpty()) {

            }
            backRecur(nums, i + 1, cur + nums[i], target);
        }
    }
}
