package leetCode;

import org.junit.Test;

public class _459 {

    @Test
    public void test() {
        String test = "abab";
        boolean b = repeatedSubstringPattern(test);
        System.out.println(b);
    }
    public boolean repeatedSubstringPattern(String s) {
        String sub = "";
        int end = 1;
        char test = s.charAt(0);
        while (s.charAt(end) != test) end++;
        sub = s.substring(0, end);
        if ((s.length() % end) != 0) return false;
        for (int i = end; i <= s.length() - end; i = i + end) {
            if (!judge(s.substring(i, i + end), sub)) return false;
        }
        return true;
    }
    private boolean judge(String s, String t) {
        if (s.length() != t.length()) return false;
        int index = 0;
        while (index < s.length()) {
            if (s.charAt(index) != t.charAt(index)) return false;
            index++;
        }
        return true;
    }
}
