import org.junit.Test;

import java.util.Random;

public class _215数组中的第K大的元素 {
    public int findKthLargest(int[] nums, int k) {
        return findKthLargest(nums, 0, nums.length - 1, nums.length - k);
    }
    private int findKthLargest(int[] nums, int left, int right, int target) {
        int index = partiton(nums, left, right);
        if (index == target) return nums[index];
        else if (index > target) {
            return findKthLargest(nums, left, index - 1, target);
        } else {
            return findKthLargest(nums, index + 1, right, target);
        }
    }
    private int partiton(int[] nums, int left, int right) {
        Random random = new Random();
        int pivot = left + random.nextInt(right - left + 1);
        swap(nums, left, pivot);
        pivot = nums[left];
        while (left < right) {
            while (left < right && nums[right] >= pivot) right--;
            nums[left] = nums[right];
            while (left < right && nums[left] <= pivot) left++;
            nums[right] = nums[left];
        }
        nums[left] = pivot;
        return left;
    }
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] =  tmp;
    }
}
