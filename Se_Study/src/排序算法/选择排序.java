package 排序算法;

public class 选择排序 {

    public void selectSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int tmp = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[tmp]) {
                    tmp = j;
                }
            }
            if (tmp != i) {
                int temp = nums[i];
                nums[i] = nums[tmp];
                nums[tmp] = temp;
            }
        }
    }
}
