package 排序算法;

import org.junit.Test;

import java.util.Arrays;

public class 快速排序 {

    public void quickSort(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }
    private void sort(int[] nums, int i, int j) {
        if (i >= j) return;
        int low = i, high = j;
        int tmp = nums[i];
        while (low < high) {
            while (low < high && nums[high] >= tmp) high--;
            nums[low] = nums[high];
            while (low < high && nums[low] <= tmp) low++;
            nums[high] = nums[low];
        }
        nums[low] = tmp;
        sort(nums, i, low - 1);
        sort(nums, low + 1, j);
    }

    @Test
    public void test() {
        int[] t = {1,3,5,2,7,9,10,100,89,55,124,198,1233,12313,1222};
        quickSort(t);
        System.out.println(Arrays.toString(t));
    }

    @Test
    public void t1() {
        int[] t = {1,2,3,4,5};
        quickSort(t);
        System.out.println(Arrays.toString(t));
    }
}
