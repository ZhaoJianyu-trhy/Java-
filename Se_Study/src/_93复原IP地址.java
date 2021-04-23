import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class _93复原IP地址 {

    List<String> ans;
    StringBuilder path;

    @Test
    public void test() {
        String t = "010010";
        restoreIpAddresses(t);
    }

    public List<String> restoreIpAddresses(String s) {
        ans = new ArrayList<>();
        if (s == null || s.length() < 4) return ans;
        path = new StringBuilder();
        recur(s, 0, 0);
        return ans;
    }

    private void recur(String s, int start, int num) {
        if (num == 3) {
            String tmp1 = s.substring(start, s.length());
            if (isValidate(tmp1)) {
                path.append(tmp1);
                ans.add(new String(path));
                path.delete(path.length() - tmp1.length(), path.length());
            }
            return;
        }
        for (int i = start; i < s.length() && i - start <= 2; i++) {
            int cut = i + 1;
            if (s.length() - cut > (3 - num) * 3 || s.length() - cut < 3 - num) continue;
            String tmp = s.substring(start, cut);
            if (!isValidate(tmp)) continue;
            path.append(tmp).append(".");
            recur(s, i + 1, num + 1);
            path.delete(path.length() - 1 - tmp.length(), path.length());
        }
    }

    private boolean isValidate(String s) {
        if (s.charAt(0) == '0' && s.length() > 1) return false;
        int check = Integer.parseInt(s);
        return check <= 255;
    }
}
