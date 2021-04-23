import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class _221最大正方形 {
    public int maximalSquare(char[][] matrix) {
        int len, col, ans = 0;
        if (matrix == null || (len = matrix.length) < 1) return 0;
        col = matrix[0].length;
        int[][] mt = new int[len][col];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < col; j++) {
                mt[i][j] = matrix[i][j] - '0';
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < col; j++) {
                if (mt[i][j] == 0) continue;
                if (i > 0 && mt[i - 1][j] > 0) {
                    mt[i][j] += mt[i - 1][j];
                }
            }
            ans = Math.max(ans, getArea(mt[i]));
        }
        return ans;
    }
    private int getArea(int[] nums) {
        int len = nums.length + 2, ans = 0;
        int[] tmp = new int[len];
        for (int i = 1; i < len - 1; i++) {
            tmp[i] = nums[i - 1];
        }
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        for (int i = 1; i < len; i++) {
            while (tmp[stack.peek()] > tmp[i]) {
                int high = tmp[stack.pop()];
                int width = i - stack.peek() - 1;
                if (high == width) {
                    ans = Math.max(ans, high * width);
                }
            }
            stack.push(i);
        }
        return ans;
    }

    @Test
    public void test() {
        char[][] t = {{'1', '1', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'0', '0', '0', '0', '0'}, {'1', '1', '1', '1', '1'}, {'1', '1', '1', '1', '1'}};
        char[][] t1 = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(maximalSquare(t1));
    }

    @Test
    public void test1() {
        char c = '1';
        c = (char) (c + 3);
        String s = String.valueOf(c);
        System.out.println(s);
        System.out.println(c * c);
        System.out.println((int) c);
        System.out.println(c);
        System.out.println(c - '0');
    }
}
