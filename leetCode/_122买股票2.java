import org.junit.Test;

import java.util.Arrays;

public class _122买股票2 {

    public void maxProfit(int[] prices) {
        if (prices == null || prices.length < 1) return;
        int[] dp = new int[prices.length];
        int[] buyDate = new int[prices.length];
        int preBuy = prices[0];
        buyDate[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            if (preBuy < prices[i - 1]) {
                buyDate[i] = buyDate[i - 1];
            } else {
                buyDate[i] = i - 1;
                preBuy = prices[i - 1];
            }
            dp[i] = prices[i] - preBuy;
        }
        System.out.println(Arrays.toString(dp));
        System.out.println(Arrays.toString(buyDate));
    }

    @Test
    public void test() {
        int[] t = {7,1,5,3,6,4};
        maxProfit(t);
    }
}
