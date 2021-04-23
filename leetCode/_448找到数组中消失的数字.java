import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class _448找到数组中消失的数字 {

    public void findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if (nums == null || nums.length < 1) return;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 != i) {
                int index = nums[i] - 1, tmp = nums[index];
                nums[index] = nums[i];
                nums[i] = tmp;
            }
        }
    }

    @Test
    public void test() {
        int[] t = {4,3,2,7,8,2,3,1};
        findDisappearedNumbers(t);
        for (int i : t) {
            System.out.print(i + " ");
        }
        System.out.println();
        findDisappearedNumbers(t);
        for (int i : t) {
            System.out.print(i + " ");
        }
    }
}
