import org.junit.Test;

import java.util.Arrays;

public class _452射气球 {

    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length < 1) return 0;
        Arrays.sort(points, (v1, v2) -> v1[0] == v2[0] ? v2[1] > v1[1] ? 1: -1 : v1[0] > v2[0] ? 1 : -1);
        int ans = 1;
        int[] arrow = {points[0][0], points[0][1]};
        for (int[] balloon : points) {
            if (balloon[1] <= arrow[1]) {
                arrow[0] = balloon[0];
                arrow[1] = balloon[1];
            } else if (balloon[0] <= arrow[1] && balloon[1] >= arrow[1]) {
                arrow[0] = balloon[0];
            } else {
                ans++;
                arrow[0] = balloon[0];
                arrow[1] = balloon[1];
            }
        }
        return ans;
    }

    @Test
    public void test() {
//        int[][] t = {{-2147483646,-2147483645},{2147483646,2147483647}};
        int[][] t = {{1,2},{4,5},{1,5}};
        System.out.println("findMinArrowShots(t) = " + findMinArrowShots(t));
    }
}
