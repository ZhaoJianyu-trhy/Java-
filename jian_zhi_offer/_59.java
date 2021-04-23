import java.util.*;

public class _59 {

    public static void main(String[] args) {

        int[] ints = new int[] {1,3,-1,-3,5,3,6,7};
        int[] res = maxSlidingWindow(ints, 3);
        System.out.println(Arrays.toString(res));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || k == 0) return new int[0];
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for(int i = 0; i < k; i++) { // 未形成窗口
            while(!deque.isEmpty() && deque.peekLast() < nums[i]) deque.removeLast();
            deque.addLast(nums[i]);
        }
        res[0] = deque.peekFirst();
        for(int i = k; i < nums.length; i++) { // 形成窗口后
            if(deque.peekFirst() == nums[i - k]) deque.removeFirst();
            while(!deque.isEmpty() && deque.peekLast() < nums[i]) deque.removeLast();
            deque.addLast(nums[i]);
            res[i - k + 1] = deque.peekFirst();
        }
        return res;
    }
}
