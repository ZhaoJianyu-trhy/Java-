import org.junit.Test;

public class 数组初始化默认数值 {

    @Test
    public void testChar() {
        char[] array = new char[10];
        for (char c : array) {
            System.out.print((c == '0') + " ");
        }
    }
}
