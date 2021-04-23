package leetCode.kmp;

import org.junit.Test;

import java.util.Arrays;

public class GetNext {
    String t = "abababca";

    @Test
    public void test() {
        int[] next = getNext(t);
        System.err.println(Arrays.toString(next));
    }

    public int[] getNext(String s) {
        int[] ans = new int[s.length()];
        int j = 0;
        for (int i = 1; i < s.length(); i++) {
            while (j > 0 && s.charAt(j) != s.charAt(i)) j = ans[j - 1];
            if (s.charAt(j) == s.charAt(i)) j++;
            ans[i] = j;
        }
        return ans;
    }
}
