import org.junit.Test;

public class StringSplitTest {
    @Test
    public void test() {
        String test = "aaa  b c  d";
        String[] split = test.split(" ");
        for (String str : split) System.err.println(str);
    }

    @Test
    public void splitTest2() {
        String test = "a  b c d ";
        String[] split = test.split(" ");
        System.out.println("split数组长度：" + split.length);
        for (String str : split) System.err.println(str);
    }

    @Test
    public void splitTest() {
        String test = "a b c d";
        String[] split = test.split(" ");
        System.out.println("split数组长度：" + split.length);
        for (String str : split) System.err.println(str);
    }
}
