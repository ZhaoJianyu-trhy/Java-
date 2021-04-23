import org.junit.Test;

public class 数值的整数次方 {

    /**
     * 只求非负指数
     * 时间复杂度O(n)
     * @param x
     * @param y
     * @return
     */
    public static double myPow(int x, int y) {
        if (y == 0) return 1;
        return myPow(x, y - 1) * x;
    }

    /**
     * 只考虑非负指数的情况，降低时间复杂度
     */
    public static double myPow1(int x, int y) {
        if (y == 0) return 1;
        return ((y & 1) == 0)
                ? myPow1(x, y / 2) * myPow1(x, y / 2)
                : x * myPow1(x, y / 2) * myPow1(x, y / 2);
    }

    /**
     * 正式版，涵盖正负的指数
     * @param x
     * @param y
     * @return
     */
    public static double myPowF(int x, int y) {
        if (y == 0) return 1;
        if (y < 0) return 1.0 / x * myPowF(x, -y - 1);
        return (y & 1) == 0 ? myPowF(x * x, y / 2) : x * myPowF(x * x, y / 2);
    }

    @Test
    public void test() {
        double v = myPow(2, 4);
        System.out.println("v = " + v);
    }

    @Test
    public void test1() {
        System.out.println("myPow1(2, 5) = " + myPow1(2, 5));
    }

    @Test
    public void testF() {
        System.out.println("myPowF(2, -1) = " + myPowF(-2, 4));
    }
}
