import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    @Test
    public void test() {
        Map<String, Integer> map = new HashMap<>();
        map.put("c",10);
        map.put("b", 1);
        map.put("a", 0);
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());
        }
    }

    @Test
    public void test1() {
        Map<String, Boolean> map = new HashMap<>();
        map.put("NJ", false);
        map.put("CQ", false);
        map.put("DL", false);
        System.out.println(map);
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            if (entry.getKey() == "NJ") entry.setValue(true);
            else continue;
        }
    }

    @Test
    public void testRemove() {
        Map<Integer, Object> map = new HashMap<>();
        Object remove = map.remove(1);
        System.out.println(remove);
    }
}
