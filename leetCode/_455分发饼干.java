import org.junit.Test;

import java.util.Arrays;

public class _455分发饼干 {

    public int findContentChildren(int[] g, int[] s) {
        if (g.length < 1 || s.length < 1) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int minSzie = Math.min(g.length, s.length);
        int i = 0;
        while (i < minSzie && s[i] < g[0]) i++;
        int start = i;
        for (; i < minSzie; i++) {
            if (s[i] < g[i]) break;
        }
        return i;
    }

    @Test
    public void test() {
        int[] g = {10, 9, 8, 7};
        int[] s = {5, 6, 7, 8};
        findContentChildren(g, s);
    }
}
