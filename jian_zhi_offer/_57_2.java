import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class _57_2 {

    public static void main(String[] args) {

        _57_2 v = new _57_2();
        int[][] ans = v.findContinuousSequence(9);
        for (int[] t : ans) {
            for (int n : t) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
    public int[][] findContinuousSequence(int target) {
        if (target < 3) return new int[0][0];
        List<List<Integer>> ans = new ArrayList<>();
        int ceiling = target / 2;
        for (int i = 1; i < ceiling; i++) {
            int sum = 0;
            //双重循环时，里层的break跳出里层的循环
            for (int j = i;; j++) {
                sum += j;
                if (sum > target) break;
                else if (sum == target) {
                    List<Integer> tmp = new ArrayList<>();
                    for (int k = i; k <= j; k++) {
                        tmp.add(k);
                    }
                    ans.add(tmp);
                    break;
                }
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
    //双重循环时，里层的break跳出里面的循环
    @Test
    public void doubleIfTest() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 1) break;
                System.out.print(i + " " + j);
                System.out.println();
            }
        }
    }
}
