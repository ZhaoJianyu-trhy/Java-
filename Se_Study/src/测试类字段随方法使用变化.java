import org.junit.Test;

public class 测试类字段随方法使用变化 {

    int ans;
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length < 1) return ans;
        mergeSort(nums, 0, nums.length - 1, new int[nums.length]);
        return ans;
    }
    private void mergeSort(int[] nums, int low, int high, int[] tmp) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(nums, low, mid, tmp);
        mergeSort(nums, mid + 1, high, tmp);
        merge(nums, low, mid, high, tmp);
    }
    private void merge(int[] nums, int low, int mid, int high, int[] tmp) {
        int i = low, j = mid + 1, index = 0;
        while (i <= mid && j <= high) {
            if (nums[i] > nums[j]) {
                tmp[index++] = nums[j++];
                ans += mid + 1 - i;
            } else {
                tmp[index++] = nums[i++];
            }
        }
        while (i <= mid) tmp[index++] = nums[i++];
        while (j <= high) tmp[index++] = nums[j++];
        int left = low;
        index = 0;
        while (left <= high) nums[left++] = tmp[index++];
    }

    private int getAns() {
        return ans;
    }

    @Test
    public void test() {
        测试类字段随方法使用变化 c = new 测试类字段随方法使用变化();
        int[] t = {7, 5, 6, 4};
        int[] t1 = {8, 7, 6, 5, 4};
        c.reversePairs(t);
        c.reversePairs(t1);
        System.out.println(c.getAns());
    }
}
