import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class _17_21直方图的水量 {

    public int trap(int[] height) {
        int ans = 0;
        if (height == null || height.length < 3) return 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < height.length; i++) {
            if (stack.isEmpty() || height[stack.peek()] >= height[i]) {
                stack.push(i);
                continue;
            }
            while (!stack.isEmpty() && height[i] > stack.peek()) {
                int mid = stack.pop();
                if (stack.isEmpty()) break;
                int left = stack.peek(), len = i - left - 1;
                ans += (Math.min(height[left], height[i]) - height[mid]) * len;
            }
            stack.push(i);
        }
        return ans;
    }

    @Test
    public void test() {
        int[] t = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("trap(t) = " + trap(t));
    }
}
