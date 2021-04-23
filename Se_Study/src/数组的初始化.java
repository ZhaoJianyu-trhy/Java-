import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;

public class 数组的初始化 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<Integer>() {{add(1);}};
        int[] ans = new int[] {2, 2};
    }

    @Test
    public void test() {
        LinkedList<Character> list = new LinkedList<>();
        list.add('a');
        list.add('b');
        System.out.println(list.toString());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.length();
        stringBuilder.append('a');
        stringBuilder.append('b');
        System.out.println(stringBuilder.toString());
    }

    @Test
    public void test1() {
        int[] test = new int[10];
        for (int i : test) {
            System.out.print(i + " ");
        }
    }
}
