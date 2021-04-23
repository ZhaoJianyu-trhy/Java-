import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class _406根据身高重建队列 {

    public int[][] reconstructQueue(int[][] people) {
//        Arrays.sort(people, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if (o2[0] > o1[0] || o2[0] == o1[0] && o2[1] < o1[0]) return 1;
//                else return -1;
//            }
//        });
        Arrays.sort(people, (v1, v2) -> v1[0] == v2[0] ? v2[1] - v1[1] : v2[0] - v1[0]);
//        for (int[] n : people) {
//            System.out.println(Arrays.toString(n));
//        }
        List<int[]> list = new LinkedList<>();
        for (int[] p : people) list.add(p);
        for (int i = 0; i < list.size(); i++) {
            int[] tmp = list.get(i);
            if (i != tmp[1]) {
                list.remove(i);
                list.add(tmp[1], tmp);
            }
        }
        int[][] ans = new int[list.size()][2];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        for (int[] n : ans) {
            System.out.println(Arrays.toString(n));
        }
        return null;
    }

    @Test
    public void test() {
        int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        reconstructQueue(people);
    }
}
