package leetCode;

import org.junit.Test;

import java.util.Arrays;

public class _21 {

    @Test
    public void test() {
        int[] test = {1,2,3,4};
        int[] exchange = exchange(test);
        System.out.println(Arrays.toString(exchange));
    }

    public int[] exchange(int[] nums) {
        //双指针问题
        int low = 0, high = nums.length - 1;
        while (low < high) {
            //若直接在nums[low++]中采用++的形式，判断会失效，因为无论如何low都会+1.
            while (low < high && (nums[low] & 1) == 1) low++;
            while (low < high && (nums[high] & 1) == 0) high--;
            // int tmp = nums[low];
            // nums[low] = nums[high];
            // nums[high] = tmp;
            //为什么这里异或运算会失效呢？
            nums[low] ^= nums[high];
            nums[high] ^= nums[low];
            nums[low] ^= nums[high];
            low++;
            high--;
        }
        return nums;
    }
}
