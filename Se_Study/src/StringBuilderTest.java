import org.junit.Test;

public class StringBuilderTest {

    @Test
    public void testDelete() {
        StringBuilder str = new StringBuilder();
        str.append(123);
//        str.append("->");
        str.deleteCharAt(str.length() - 1);
        System.out.println(str);
    }

    @Test
    public void testDelete1() {
        StringBuilder str = new StringBuilder();
        String tmp = String.valueOf(-123);
        System.out.println(tmp.length());
        str.append(tmp);
        System.out.println(str);
//        str.append("->");
        str.deleteCharAt(str.length() - 1);
        System.out.println(str);
    }

    @Test
    public void testDelete2() {
        String tmp = String.valueOf(-123);
        System.out.println(tmp.length());
    }
}
