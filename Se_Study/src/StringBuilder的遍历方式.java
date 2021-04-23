import org.junit.Test;

public class StringBuilder的遍历方式 {

    /**
     * 总结：StringBuilder是不能采取for增强循环的
     * 想要增强循环遍历，可以toString().toCharArray();
     * 以char 类型遍历
     */
    @Test
    public void test() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(123456).append("char");
//        for (String c : stringBuilder) {
//
//        }
    }
}
