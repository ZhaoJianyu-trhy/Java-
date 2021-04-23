import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class _860柠檬水找零 {

    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : bills) {
            if (n == 5) {
                map.put(5, map.getOrDefault(5, 0) + 1);
            } else if (n == 10) {
                if (map.getOrDefault(5, 0) - 1 < 0) return false;
                map.put(5, map.get(5) - 1);
                map.put(10, map.getOrDefault(10, 0) + 1);
            } else if (n == 20) {
                if (map.getOrDefault(10, 0) - 1 < 0) {
                    if (map.getOrDefault(5, 0) - 3 < 0) return false;
                    map.put(5, map.get(5) - 3);
                } else {
                    if (map.getOrDefault(5, 0) - 1 < 0) return false;
                    map.put(5, map.get(5) - 1);
                    map.put(10, map.get(10) - 1);
                }
            }
        }
        return true;
    }

    @Test
    public void test() {
        int[] t = {5,5,5,10,5,5,10,20,20,20};
        System.out.println("lemonadeChange(t) = " + lemonadeChange(t));
    }
}
