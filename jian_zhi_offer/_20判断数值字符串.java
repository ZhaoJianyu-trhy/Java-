import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class _20判断数值字符串 {

    public boolean isNumber(String s) {
        if (s == null || s.length() < 1) return false;
        Map[] states = {
                new HashMap<Character, Integer>() {{
                    //状态0,首位空格,可以跳转到0,1,2,3
                    put(' ', 0);
                    put('s', 1);
                    put('d', 2);
                    put('.', 3);
                }},
                new HashMap<Character, Integer>() {{
                    //状态1，符号位，可以跳转到2,3
                    put('d', 2);
                    put('.', 3);
                }},
                new HashMap<Character, Integer>() {{
                    //状态2，整数部分，可以跳转到2,4,6,9
                    put('d', 2);
                    put('.', 4);
                    put('e', 6);
                    put(' ', 9);
                }},
                new HashMap<Character, Integer>() {{
                    //状态3，小数点，左边无整数，可以跳转到5
                    put('d', 5);
                }},
                new HashMap<Character, Integer>() {{
                    //状态4，小数点，左边有整数，可以跳转到5,6,9
                    put('d', 5);
                    put('e', 6);
                    put(' ', 9);
                }},
                new HashMap<Character, Integer>() {{
                    //状态5，小数部分,可以跳转到5,6,9
                    put('d', 5);
                    put('e', 6);
                    put(' ', 9);
                }},
                new HashMap<Character, Integer>() {{
                    //状态6，e,E，可以跳转到7,8
                    put('s', 7);
                    put('d', 8);
                }},
                new HashMap<Character, Integer>() {{
                    //状态7，指数部分符号，可以跳转到8
                    put('d', 8);
                }},
                new HashMap<Character, Integer>() {{
                    //状态8，指数部分数字，可以跳转到8,9
                    put('d', 8);
                    put(' ', 9);
                }},
                new HashMap<Character, Integer>() {{
                    //状态9，末尾空格,可以跳转到9
                    put(' ', 9);
                }}
        };
        int state = 0;
        char tmp = ' ';
        for (char c : s.toCharArray()) {
            if (c == ' ') tmp = c;
            else if (c >= '0' && c <= '9') tmp = 'd';
            else if (c == '+' || c == '-') tmp = 's';
            else if (c == 'e' || c == 'E') tmp = 'e';
            else if (c == '.') tmp = c;
            else tmp = '?';
            if (!states[state].containsKey(tmp)) return false;
            state = (int) states[state].get(tmp);
        }
        return state == 2 || state == 4 || state == 5 || state == 8 || state == 9;
    }

    @Test
    public void test() {
        String t = "+1.25e10";
        System.out.println("isNumber(t) = " + isNumber(t));
    }
}
