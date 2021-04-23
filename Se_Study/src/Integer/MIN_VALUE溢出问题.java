package Integer;

import org.junit.Test;

public class MIN_VALUE溢出问题 {

    @Test
    public void 溢出问题() {
        int t = Integer.MIN_VALUE + 1;
        t *= -1;
        System.out.println(t);
    }

    @Test
    public void 溢出问题1() {
        int t = Integer.MIN_VALUE;
        t *= -1;
        System.out.println(t);
    }
}
