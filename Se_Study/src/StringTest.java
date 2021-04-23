import org.junit.Test;

public class StringTest {

    @Test
    public void test1() {
        String t = "01123";
        System.out.println(t.compareTo("0"));
    }

    @Test
    public void testSubstring() {
        String t = "aa";
        StringBuilder str = new StringBuilder(t);
        System.out.println("t.substring(0,0) = " + t.substring(0, 0));
    }

    @Test
    public void newStringTest() {
        char[] c = {'0', '1', '2', '3'};
        System.out.println(new String(c, 1, 3));
    }

    @Test
    public void testSort() {

    }
}
