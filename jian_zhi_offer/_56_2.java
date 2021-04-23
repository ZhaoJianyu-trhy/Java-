public class _56_2 {

    public int singleNumber(int[] nums) {
        int[] tmp = new int[32];
        int mask = 1;
        for (int i = 31; i >= 0; i--) {
            for (int j = 0; j < nums.length; j++) {
                tmp[i] = tmp[i] + (nums[j] & mask);
            }
            mask <<= 1;
        }
        for (int i = 0; i < 32; i++) {
            tmp[i] %= 3;
        }
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res <<= 1;
            res |= tmp[i];
        }
        return res;
    }

    public static void main(String[] args) {
        _56_2 v = new _56_2();
        int[] t = new int[] {1, 1, 6, 1};
        int i = v.singleNumber(t);
        System.out.println(i);
    }
}
