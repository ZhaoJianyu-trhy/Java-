import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Time_test {
    @Test
    public void test1() {
        int sum = 0;
        long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        String a = "";
        a.toCharArray();
        long l = System.currentTimeMillis();
        System.out.println(l - currentTimeMillis);
        Map<Integer, Boolean> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<Integer>() {{add(1);}};
    }

    @Test
    public void test2() {
        int sum = 0;
        long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            sum += i;
            System.out.print(i);
        }
        System.out.println();
        long l = System.currentTimeMillis();
        System.out.println(l - currentTimeMillis);
    }
}
