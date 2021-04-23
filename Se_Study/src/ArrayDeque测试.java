import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDeque测试 {

    /**
     * 结论，只有LinkedList有get()方法，需要实现List接口
     */
    @Test
    public void test() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        for (int i = 0; i < list.size(); i += 2) {
            System.out.println();
        }
    }
}
