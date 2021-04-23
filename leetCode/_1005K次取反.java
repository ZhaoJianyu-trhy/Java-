import org.junit.Test;

public class _1005K次取反 {

    public int largestSumAfterKNegations(int[] A, int K) {
        int ans = 0;
        quickSort(A, 0, A.length - 1);
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0 && K > 0) {
                A[i] *= -1;
                K--;
            }
        }
        if ((K & 1) == 1) A[A.length - 1] *= -1;
        for (int n : A) ans += n;
        return ans;
    }

    private void quickSort(int[] nums, int low, int high) {
        if (low >= high) return;
        int i = low, j = high;
        int tmp = nums[i];
        while (i < j) {
            while (i < j && Math.abs(nums[j]) >= Math.abs(tmp)) j--;
            nums[i] = nums[j];
            while (i < j && Math.abs(nums[i]) <= Math.abs(tmp)) i++;
            nums[j] = nums[i];
        }
        nums[i] = tmp;
        quickSort(nums, low, i - 1);
        quickSort(nums, i + 1, high);
    }

    @Test
    public void test() {
        int[] t = {4, 2, 3};
        largestSumAfterKNegations(t, 1);
    }
}
