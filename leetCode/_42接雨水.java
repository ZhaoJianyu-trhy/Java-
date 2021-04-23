package leetCode;

import org.junit.Test;

import java.util.Stack;

public class _42接雨水 {

    @Test
    public void test() {
        int[] test = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
//        int trap = trap(test);
        int trap = trapStack(test);
        System.out.println(trap);
    }

    @Test
    public void test1() {
        int[] t = {1,2,3,4,5};
        trapTwoIndex(t);
    }

    public int trapStack(int[] height) {
        if (height == null || height.length < 2) return 0;
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[stack.peek()] < height[i]) {
                int mid = stack.pop();
                if (stack.isEmpty()) break;
                int left = stack.peek();
                int high = Math.min(height[left], height[i]) - height[mid], len = i - left - 1;
                ans += high * len;
            }
            stack.push(i);
        }
        return ans;
    }

    public int trap(int[] height) {
        if (height == null || height.length < 1) return 0;
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        leftMax[0] = height[0];
        rightMax[rightMax.length - 1] = height[height.length - 1];
        for (int i = 1; i < height.length - 1; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        for (int i = height.length - 2; i >= 1; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        int sum = 0;
        for (int i = 1; i <= height.length - 1; i++) {
            int add = Math.min(leftMax[i], rightMax[i]) - height[i];
            if (add > 0) sum += add;
        }
        return sum;
    }

    public int trapTwoIndex(int[] height) {
        int ans = 0;
        if (height == null || height.length < 3) return ans;
        int left = 0, right = height.length - 1, leftMax = height[left], rightMax = height[right];
        while (left < right) {
            if (leftMax < rightMax) {
                ans += leftMax - height[left++];
                leftMax = Math.max(leftMax, height[left]);
            } else {
                ans += rightMax - height[right--];
                rightMax = Math.max(rightMax, height[right]);
            }
        }
        return ans;
    }
}
