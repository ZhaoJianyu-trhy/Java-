import org.junit.Test;

import java.util.PriorityQueue;

public class _41数据流的中位数 {
    PriorityQueue<Integer> big;
    PriorityQueue<Integer> small;
    int size;

    @Test
    public void test() {
        addNum(1);
        addNum(2);
        double median = findMedian();
        addNum(3);
        double median1 = findMedian();
    }

    /**
     * initialize your data structure here.
     */
    public _41数据流的中位数() {
        big = new PriorityQueue<>();
        small = new PriorityQueue<>();
    }

    public void addNum(int num) {
        size++;
        if ((size & 1) == 1) {//是奇数，添加到大顶堆
            small.offer(num);
            big.offer(small.poll());
        } else {
            big.offer(num);
            small.offer(big.poll());
        }
    }

    public double findMedian() {
        if ((size & 1) == 1) {
            return (double) big.peek();
        } else {
            return (big.peek() * 1.0 + small.peek()) / 2;
        }
    }
}
