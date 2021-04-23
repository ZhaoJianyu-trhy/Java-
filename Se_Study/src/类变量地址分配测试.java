import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class 类变量地址分配测试 {
    List<Integer> ans;
    public void init() {
        ans = new ArrayList<>();
    }

    @Test
    public void test() {
        init();
        System.out.println(ans);
    }
}
