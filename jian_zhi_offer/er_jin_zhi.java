import java.util.Arrays;

public class er_jin_zhi {

    public static void main(String[] args) {
        int a = 16;
        getInt(getB(a));
    }
    public static int[] getB(int num) {
        int[] tmp = new int[32];
        int mask = 1;
        for (int i = 31; i >= 0; i--) {
            tmp[i] = num & mask;
            num >>>= 1;
        }
        System.out.println(Arrays.toString(tmp));
        return tmp;
    }

    public static void getInt(int[] tmp) {
        int res = 0;
        for (int i = 0; i < tmp.length; i++) {
            res <<= 1;
            res |= tmp[i];
        }
        System.out.println(res);
    }
}
