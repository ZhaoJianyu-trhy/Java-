import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class _763划分字母区间 {

    public List<Integer> partitionLabels(String S) {
        List<Integer> ans = new ArrayList<>();
        if (S == null || S.length() < 1) return ans;
        int[] map = new int[26];
        char[] c = S.toCharArray();
        for (int i = 0; i < c.length; i++) {
            map[c[i] - 'a'] = i;
        }
        int index = 0;
        while (index <= c.length - 1) {
            int right = map[c[index] - 'a'];
            for (int i = index + 1; i <= right; i++) {
                if (map[c[i] - 'a'] > right) right = map[c[i] - 'a'];
            }
            ans.add(right + 1 - index);
            index = right + 1;
        }
        return ans;
    }

    @Test
    public void test() {
        String t = "bceacbacdbbadea";
        partitionLabels(t);
    }
}
