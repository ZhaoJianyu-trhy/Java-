package leetCode;

import org.junit.Test;

public class _541 {

    @Test
    public void test() {
        String test = "abcdefg";
//        char[] sss = {'a', 'b'};
        String str = reverseStr(test, 2);
        System.out.println(str);
//        System.out.println(String.valueOf(sss));
    }

    public String reverseStr(String s, int k) {
        int len = 2 * k;
        int n = s.length() / len, yuShu = s.length() % len;
        char[] word = s.toCharArray();
        for (int i = 0; i < n; i++) {
            int start = i * len, end = start + k - 1;
            reverse(word, start, end);
        }
        int fEnd = Math.min(n * len + k - 1, s.length() - 1);
        if (yuShu >= k) reverse(word, n * len, fEnd);
        else reverse(word, n * len, s.length() - 1);
        return String.valueOf(word);
    }
    private void reverse(char[] s, int low, int high) {
        while (low < high) {
            // s.charAt(low) ^= s.charAt(high);
            // s.charAt(high) ^= s.charAt(low);
            // s.charAt(low) ^= s.charAt(high);
            s[low] ^= s[high];
            s[high] ^= s[low];
            s[low] ^= s[high];
            low++;
            high--;
        }
    }
}
