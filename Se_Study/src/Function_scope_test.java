import java.util.Arrays;

public class Function_scope_test {

    public static void main(String[] args) {
        int[] a = new int[3];
        opNum(a);
        System.out.println(Arrays.toString(a));
    }

    //传送的引用，所以能修改值
    public static void opNum(int[] nums) {
        nums[1] = 2;
    }
}
