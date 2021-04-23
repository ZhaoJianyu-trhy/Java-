package leetCode;

import java.util.Arrays;

public class _59 {

    public static void main(String[] args) {

        int[][] ints = generateMatrix(3);
        for (int[] n : ints) System.out.println(Arrays.toString(n));
    }

    public static int[][] generateMatrix(int n) {
        if (n < 1) return new int[0][0];
        int[][] ans = new int[n][n];
        int right = n - 1, left = 0, up = 0, down = n - 1, step = 1;
        while (step <= n * n) {
            for (int i = left; i <= right; i++) {
                ans[up][i] = step++;
            }
            up++;
            for (int i = up; i >= down; i--) {
                ans[i][right] = step++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                ans[down][i] = step++;
            }
            down--;
            for (int i = down; i <= up; i++) {
                ans[i][left] = step++;
            }
            left++;
        }
        return ans;
    }
}
