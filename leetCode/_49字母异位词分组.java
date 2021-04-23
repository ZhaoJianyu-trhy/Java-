import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _49字母异位词分组 {

    @Test
    public void test() {
        String[] t = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(t);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String tmp = sort(str);
            List<String> list = map.getOrDefault(tmp, new ArrayList<String>());
            list.add(str);
            map.put(tmp, list);
        }
        List<List<String>> ans = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }

    private String sort(String str) {
        char[] c = str.toCharArray();
        quickSort(c, 0, c.length - 1);
        return new String(c);
    }

    private void quickSort(char[] c, int low, int high) {
        if (low >= high) return;
        char tmp = c[low];
        int i = low, j = high;
        while (i < j) {
            while (i < j && c[j] >= tmp) j--;
            c[i] = c[j];
            while (i < j && c[i] <= tmp) i++;
            c[j] = c[i];
        }
        c[i] = tmp;
        quickSort(c, low, i - 1);
        quickSort(c, i + 1, high);
    }
}
