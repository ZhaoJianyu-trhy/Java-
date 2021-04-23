import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class _20判断括号 {

    @Test
    public void test() {
        String t = "([)]";
        System.out.println("isValid(t) = " + isValid(t));
    }

    public boolean isValid(String s) {
        if (s == null || s.length() < 2) return false;
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.peek() != c) return false;
            else stack.pop();
        }
        return stack.isEmpty();
    }
}
