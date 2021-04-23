import java.util.*;

public class _61 {

    public static void main(String[] args) {
        boolean ans;
        int[] nums = new int[] {0,0,1,2,5};
        Arrays.sort(nums);
        int numsOfZero = 0;
        for (int i = numsOfZero; i < nums.length && nums[i] == 0; i++, numsOfZero++);
        int numsOfGap = 0;
        int big = numsOfZero + 1;
        for (int i = numsOfZero; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) ans =  false;
            numsOfGap += nums[i + 1] - nums[i] - 1;
        }
        ans =  numsOfZero >= numsOfGap;
    }
}
