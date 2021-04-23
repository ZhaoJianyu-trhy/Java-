package 背包问题;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class _139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.length() < 1) return true;
        return backRecur(s, wordDict, 0);
    }

    private boolean backRecur(String s, List<String> wordDict, int startIndex) {
        if (startIndex >= s.length()) return true;
        for (int i = startIndex; i < s.length(); i++) {
            String str = s.substring(startIndex, i + 1);
            if (wordDict.contains(str) && backRecur(s, wordDict, i + 1)) return true;
        }
        return false;
    }

    @Test
    public void test() {
        String s = "catsandog";
        List<String> wordDict = new ArrayList<String>() {{add("cat"); add("cats"); add("and"); add("og");}};
        System.out.println(wordBreak(s, wordDict));
    }
}
