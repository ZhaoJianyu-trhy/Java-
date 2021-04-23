import org.junit.Test;

import java.util.Arrays;

public class _435无重叠区间 {

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length < 1) return 0;
        Arrays.sort(intervals, (v1, v2) -> v1[0] == v2[0] ? v2[1] > v1[1] ? 1 : -1 : v1[0] > v2[0] ? 1 : -1);
        int ans = 0;
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][0] == intervals[i + 1][0]) ans++;
        }
        return ans;
    }

    @Test
    public void test() {
        int[][] t = {{1,100},{11,22},{1,11},{2,12}};
        System.out.println("eraseOverlapIntervals(t) = " + eraseOverlapIntervals(t));
    }
}
