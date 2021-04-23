import org.junit.Test;

public class _714买卖股票含手续费 {

    public int maxProfit(int[] prices, int fee) {
        int res = 0, minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) minPrice = prices[i];
//            if (prices[i] >= minPrice && prices[i] <= minPrice + fee) continue;
            if (prices[i] > minPrice + fee) {
                res += prices[i] - minPrice - fee;
                minPrice = prices[i] - fee;
            }
        }
        return res;
    }

    @Test
    public void test() {
//        int[] t = {1, 3, 2, 8, 4, 9};
        int[] t = {1, 8, 10};
        int profit = maxProfit(t, 2);
        System.out.println("profit = " + profit);
    }
}
