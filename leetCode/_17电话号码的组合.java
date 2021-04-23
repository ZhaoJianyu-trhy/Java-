import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _17电话号码的组合 {
    List<String> ans;
    StringBuilder tmp;
    Map<Character, String> map;

    @Test
    public void test() {
        String t = "23";
        List<String> strings = letterCombinations(t);
    }

    public List<String> letterCombinations(String digits) {
        ans = new ArrayList<>();
        if (digits == null || digits.length() < 1) return ans;
        tmp = new StringBuilder();
        map = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        recur(digits, 0);
        return ans;
    }

    private void recur(String digits, int index) {
        if (index >= digits.length()) return;
        if (tmp.length() == digits.length()) {
            ans.add(tmp.toString());
            return;
        }
        String string = map.get(digits.charAt(index));
        for (int i = 0; i < string.length(); i++) {
            tmp.append(string.charAt(i));
            recur(digits, index + 1);
            tmp.deleteCharAt(tmp.length() - 1);
        }
    }
}
