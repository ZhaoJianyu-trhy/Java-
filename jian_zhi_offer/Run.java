import org.junit.Test;

import java.util.*;

public class Run {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        List<Character> list1 = new ArrayList<>();
        Queue list = new LinkedList();
        _67 solution = new _67();
        String str = "+";
        int i = solution.strToInt(str);
        System.out.println(i);
    }


    @Test
    public void StringBuilderTEst() {
        StringBuilder strbuilder = new StringBuilder();
        strbuilder.append("aaa");
//        strbuilder.insert(strbuilder.length() - 1, "b");
//        strbuilder.replace(strbuilder.length() - 1, strbuilder.length() ,"b");
        strbuilder.insert(strbuilder.length(), "]");
        strbuilder.insert(0, "[");
        strbuilder = new StringBuilder();
        String aaa = "1";
        aaa.length();
        if (aaa.equals("hello")) System.out.println("true");
        System.out.println(strbuilder.toString());
    }

    @Test
    public void test() {
        String s = "";
        char[] chars = s.toCharArray();
        System.out.println(chars.toString());
        System.out.println(s.trim());
        System.out.println(s);
//        Integer.MAX_VALUE
    }

    @Test
    public void _19() {
        _19_V1 v1 = new _19_V1();
        String s = "aa";
        String p = "a*";
        boolean match = v1.isMatch(s, p);
        System.out.println(match);
    }

    @Test
    public void sizeTest() {
        LinkedList<Character> list = new LinkedList<Character>() {{add('e'); add('f');}};
        System.out.println(list.toString());
//        System.out.println(list.size());
    }
}
