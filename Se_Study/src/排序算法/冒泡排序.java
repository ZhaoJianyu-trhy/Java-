package 排序算法;

import org.junit.Test;

import java.util.Arrays;

public class 冒泡排序 {

    public void bobSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
    }

    @Test
    public void test() {
        int[] t = {5, 4, 3, 2, 1};
        bobSort(t);
        System.out.println(Arrays.toString(t));
    }
}
