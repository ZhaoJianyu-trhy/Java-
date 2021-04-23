import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    @Test
    public void testRemoveAll() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.removeAll(list);
        System.out.println(list);
    }
}
