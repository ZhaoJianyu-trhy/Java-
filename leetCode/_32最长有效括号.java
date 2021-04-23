import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class _32最长有效括号 {
    public int longestValidParentheses(String s) {
        int len, ans = 0;
        if (s == null || (len = s.length()) < 2) return 0;
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                //如果栈里只包含一个')'，更新此时')'的下标
                if (stack.size() == 1) {
                    stack.pop();
                    stack.push(i);
                } else {
                    stack.pop();
                    ans = Math.max(ans, i - stack.peek());
                }
            }
        }
        return ans;
    }

    @Test
    public void test() {
        String t = ")()())";
        longestValidParentheses(t);
    }
}
