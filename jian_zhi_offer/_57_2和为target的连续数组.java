import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _57_2和为target的连续数组 {

    @Test
    public void test() {
        int target = 20;
        List<List<Integer>> lists = findContinuousSequence(target);
        System.out.println(lists);
    }

    public List<List<Integer>> findContinuousSequence(int target) {
        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<Integer> tmp = new LinkedList<>();
        int low = 1, high = 1, sum = 1;
        tmp.add(1);
        while (high <= (target + 1) / 2) {
            if (sum < target) {
                high++;
                sum += high;
                tmp.add(high);
            } else if (sum > target) {
                tmp.removeFirst();
                sum -= low;
                low++;
            } else {
                ans.add(new ArrayList(tmp));
                low++;
                high++;
                tmp.add(high);
                sum += high - tmp.removeFirst();
            }
        }
        return ans;
    }
}
