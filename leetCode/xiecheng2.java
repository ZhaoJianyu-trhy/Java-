import org.junit.Test;

import java.util.ArrayList;

public class xiecheng2 {
    @Test
    public void count() {
        int ans = 0, cur = 0;
//        int[] nums = {6,2,5,5,3,7,3,1,1,4,4,8,8};
//        int[] nums = {10,2,8,2,9,1,10};
        int[] nums = {50,100,13,14,10};
        int target = 10;
        int left = 0, right = 0;
        while (right <= nums.length && left < nums.length) {
            if (right < nums.length && cur < target) {
                cur += nums[right];
                right++;
            } else if (cur == target) {
                ans++;
                cur -= nums[left];
                left++;
            } else {
                cur -= nums[left];
                left++;
            }
        }
//        while (right < )
        System.out.println(ans);
    }
}
