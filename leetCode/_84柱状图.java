package leetCode;

import org.junit.Test;

import java.util.Stack;

public class _84柱状图 {

    @Test
    public void test() {
        int[] t = {0, 9};
        int area = largestRectangleArea(t);
        System.out.println(area);
    }

    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length < 1) return 0;
        if (heights.length == 1) return heights[0];
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] == 0) {
                while (!stack.isEmpty()) stack.pop();
                continue;
            }
            else {
                if (stack.isEmpty()) ans = ans = Math.max(ans, heights[i]);
                else {
                    int left = stack.pop(), len = i - left + 1, high = Math.min(heights[left], heights[i]);
                    ans = Math.max(ans, len * high);
                }
                stack.push(i);
            }
        }
        return ans;
    }
}
