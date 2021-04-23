package leetCode;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 2};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
    }
}
