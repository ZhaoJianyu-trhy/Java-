import org.junit.Test;

public class KMP算法 {

    /**
     * 测试text串中是否包含pattern串
     */
    @Test
    public void test() {
        String text = "mississippi", pattern = "issipi";
        boolean isInclude = isInclude(text, pattern);
        System.out.println(isInclude);
    }

    /**
     * 测试text串中是否包含pattern串，若包含则返回pattern在text中的起始位置
     */
    @Test
    public void test1() {
        String text = "aabaabaaf", pattern = "aabaaf";
        int i = indexOf(text, pattern);
        System.out.println(i);
    }

    /**
     * 确立好了KMP模板，以后就按照这个写
     * @param text
     * @param pattern
     * @return
     */
    public int indexOf(String text, String pattern) {
        if (pattern.length() < 1) return 0;
        int[] next = getNext(pattern);
        int j = 0;
        for (int i = 0; i < text.length(); i++) {
            while (j > 0 && text.charAt(i) != pattern.charAt(j)) j = next[j - 1];
            if (text.charAt(i) == pattern.charAt(j)) j++;
            if (j == pattern.length()) return i - pattern.length() + 1;//因为此时i还没有前移一位
        }
        return -1;
    }
    /**
     * 山寨版String.indexOf()
     * @param text
     * @param pattern
     * @return
     */
    public int strStr(String text, String pattern) {
        int[] next = getNext(pattern);
        int j = 0, i = 0;
        while (true) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == pattern.length()) {
                    return i - pattern.length();
                }
                if (i == text.length()) return -1;
            } else {
                if (j > 0) j = next[j - 1];
                else i++;
                if (i == text.length()) return -1;
            }
        }
    }

    /**
     * 确立好的判断是否包含的KMP算法
     * @param text
     * @param pattern
     * @return
     */
    public boolean isInclude(String text, String pattern) {
        int[] next = getNext(pattern);
        int j = 0;
        for (int i = 0; i < text.length(); i++) {
            while (j > 0 && text.charAt(i) != pattern.charAt(j)) j = next[j - 1];
            if (text.charAt(i) == pattern.charAt(j)) j++;
            if (j == pattern.length()) return true;
        }
        return false;
    }

    /**
     * 判断text串中是否包含pattern串
     * @param text
     * @param pattern
     * @return
     */
    public boolean judgeIfInclude(String text, String pattern) {
        int[] next = getNext(pattern);
        int j = 0, i = 0;
        while (true) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == pattern.length()) {
                    return true;
                }
            } else {
                if (j > 0) j = next[j - 1];
                else i++;
                if (i == text.length()) return false;
            }
        }
    }

    /**
     * 求解NEXT数组的方法
     * @param s
     * @return
     */
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
