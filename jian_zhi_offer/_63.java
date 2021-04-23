import org.junit.Test;

import java.math.BigDecimal;

public class _63 {

    public static void main(String[] args) {
        int[] nums = new int[] {7,1,5,3,6,4};
        System.out.println(maxValue(nums));
    }

    public static int maxValue(int[] prices) {
        int minBuy = prices[0], curSell = prices[1], maxProfit = curSell - minBuy, ans = maxProfit;
        for (int i = 2; i < prices.length; i++) {
            minBuy = Math.min(minBuy, prices[i - 1]);
            ans = Math.max(prices[i] - minBuy, ans);
        }
        return ans;
    }

    @Test
    public void run() {


    }
}
