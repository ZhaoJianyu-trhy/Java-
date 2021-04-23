import org.junit.Test;

public class er_fen_cha_zhao {

    public int binarySearch(int[] nums, int target, int low, int high) {
        if (target < nums[low] || target > nums[high] || low > high) return -1;
        int mid = low + (high - low) / 2;//避免大数溢出
        if (target == nums[mid]) return mid;
        else if (target > nums[mid]) return binarySearch(nums, target, mid + 1, high);
        else return binarySearch(nums, target, low, mid - 1);
    }

    public int binarySearch3(int[] nums) {
        if (nums == null || nums.length < 1) return -1;
        int low = 0, high = nums.length - 1, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == mid) return mid;
            else if (nums[mid] < mid) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public int binarySearch(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid = 0;
        if (target < nums[low] || target > nums[high]) return -1;
        while (low <= high) {
            mid = low + (high - low) / 2;//避免大数溢出
            if (target == nums[mid]) return mid;
            else if (target < nums[mid]) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    @Test
    public void test() {
        int[] nums = new int[] {1,3,5,7,9,11};
        int target = 1;
        /*System.out.println(binarySearch(nums, target, 0, nums.length - 1));
        System.out.println(binarySearch(nums, 12, 0, nums.length - 1));*/
        System.out.println(binarySearch(nums, 20));
    }

    @Test
    public void test1() {
        int[] nums = new int[] {-3, -1, 1, 3, 5};
        System.out.println(binarySearch3(nums));
    }
}
