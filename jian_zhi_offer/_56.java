import org.junit.Test;

public class _56 {
    public int singleNumbers(int[] nums) {
        //采用位运算的方式来求解
        int tmp = 0;//保存所有数组的异或结果
        for (int n : nums) {
            tmp ^= n;
        }
        //寻找最低一位的1，用来做分组依据
        int check = 1;
        while ((check & tmp) == 0) {
            check = check << 1;//这里关于位运算的左移，右移操作需要强化记忆，尤其是正负数的时候
        }
//        int a = 0, b = 0;
//        for (int n : nums) {
//            if ((n & check) == 1) {
//                a ^= n;
//            } else {
//                b ^= n;
//            }
//        }
//        return new int[] {a, b};
        return check;
    }

    public static void main(String[] args) {
        _56 v = new _56();
        int[] nums = {1, 2, 5, 2};
        int i = v.singleNumbers(nums);
        System.out.println(i);

    }
    @Test
    public void test() {
        System.out.println(1 & 3);
    }
}
