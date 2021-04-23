import org.junit.Test;

public class _45 {
//    public String minNumber(int[] nums) {
//        StringBuilder strBuilder = new StringBuilder();
//        qucikSort(nums, 0, nums.length - 1);
//        for (int i = 0; i < nums.length; i++) {
//            strBuilder.append(nums[i]);
//        }
//        return strBuilder.toString();
//    }
//    private void qucikSort(int[] nums, int i, int j) {
//        if (i >= j) return;
//        int index = Sort(nums, i, j);
//        qucikSort(nums, i, index - 1);
//        qucikSort(nums, index + 1, j);
//    }
//    private int Sort(int[] nums, int low, int high) {
//        int tmp = nums[0];
//        int i = low, j = high;
//        while (i < j) {
//            while (i < j && ) j--;
//            nums[i] = nums[j];
//            while (i < j && ) i++;
//            nums[j] = nums[i];
//        }
//        nums[i] = tmp;
//        return i;
//    }
//    private boolean A_dayu_B(int i, int j) {
//        char[] tmpI = String.valueOf(i).toCharArray();
//        char[] tmpJ = String.valueOf(j).toCharArray();
//        int t1 = 0, t2 = 0;
//        while (t1 < tmpI.length && t2 < tmpJ.length) {
//            if (tmpI[t1] > tmpJ[t2]) return true;
//            else if (tmpI[t1] == tmpJ[t2]) {
//                t1++;
//                t2++;
//            } else return false;
//        }
//        if (t2 >= tmpJ.length) {
//            if (tmpI[t1] > tmpI[t1 - 1]) return true;
//            else return false;
//        }
//        if (t1 >= tmpI.length) {
//            if (tmpJ[t2] <= tmpJ[t2 - 1]) return true;
//            else return false;
//        }
//        return false;
//    }
//    private boolean A_xiaoyu_B(int i, int j) {
//        return !A_dayu_B(i, j);
//    }

//    public static void main(String[] args) {
//        _45 v = new _45();
//        int[] nums = {3,30,34,5,9};
//        String s = v.minNumber(nums);
//        System.out.println(s);
//    }

    @Test
    public void StringTest() {
        String n1 = "334";
        String n2 = "333";
        System.out.println(n1.compareTo(n2));
    }
}
