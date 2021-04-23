import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class _93复原IP {
    List<String> ans;
    StringBuilder path;

    @Test
    public void test() {
        String t = "25525511135";
        restoreIpAddresses(t);
    }

    public List<String> restoreIpAddresses(String s) {
        ans = new ArrayList<>();
        if (s == null || s.length() < 1) return ans;
        path = new StringBuilder();
        recur(s, 0);
        return ans;
    }

    private void recur(String s, int start) {
        if (start == 4) {
            path.deleteCharAt(path.length() - 1);
            ans.add(new String(path));
            return;
        }
        for (int i = start; i < s.length() && i - start <= 2; i++) {
            if (i > start && s.charAt(start) == '0') continue;
            String tmp = s.substring(start, i + 1);
            int check = Integer.parseInt(tmp);
            if (check > 255) continue;
            path.append(tmp).append(".");
            recur(s, i + 1);
            path.delete(path.length() - 1 - tmp.length(), path.length());
        }
    }
}
