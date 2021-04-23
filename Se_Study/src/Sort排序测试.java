import org.junit.Test;

import java.util.Arrays;

public class Sort排序测试 {

    @Test
    public void test() {
        int[][] t = {{1,5}, {4, 5}, {3, 5}, {1, 6}, {2, 5}};
        Arrays.sort(t, (v1, v2) -> v1[1] > v2[1] ? 1 : -1);
        for (int[] tmp : t) System.out.println(Arrays.toString(tmp));
    }
}
