package 排序算法;

import org.junit.Test;

import java.util.Arrays;

public class 归并排序 {

    public void guibingSort(int[] nums) {
        sort(nums, 0, nums.length - 1, new int[nums.length]);
    }
    private void sort(int[] nums, int low, int high, int[] tmp) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        sort(nums, low, mid, tmp);
        sort(nums, mid + 1, high, tmp);
        merge(nums, low, mid, high, tmp);
    }

    private void merge(int[] nums, int low, int mid, int high, int[] tmp) {
        int i = low, j = mid + 1, index = 0;
        while (i <= mid && j <= high) {
            if (nums[j] <= nums[i]) tmp[index++] = nums[j++];
            else tmp[index++] = nums[i++];
        }
        while (i <= mid) tmp[index++] = nums[i++];
        while (j <= high) tmp[index++] = nums[j++];
        index = 0;
        int left = low;
        while (left <= high) {
            nums[left++] = tmp[index++];
        }
    }

    @Test
    public void test() {
        int[] t = {1,3,5,2,7,9,10,100,89,55,124,198,1233,12313,1222};
        guibingSort(t);
        System.out.println(Arrays.toString(t));
    }
}
