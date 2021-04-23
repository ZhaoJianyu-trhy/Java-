import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetTest {
    @Test
    public void test() {
        HashSet<List<Integer>> set = new HashSet<>();
        set.add(new ArrayList<Integer>() {{
            add(1);
            add(2);
        }});
        set.add(new ArrayList<Integer>() {{
            add(2);
            add(1);
        }});
        System.out.println(set);
    }
}
