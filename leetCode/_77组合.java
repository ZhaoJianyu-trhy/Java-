import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _77组合 {

    List<List<Integer>> ans;
    LinkedList<Integer> list;

    @Test
    public void test() {
        combine(4,2);
    }

    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        list = new LinkedList<>();
        recur(n, k, 1);
        return ans;
    }

    private void recur(int n, int k, int start) {
        if (list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <= n; i++) {
            list.add(i);
            recur(n, k, start + 1);
            list.removeLast();
        }
    }
}
