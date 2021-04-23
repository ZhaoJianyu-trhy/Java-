package 背包问题;

import org.junit.Test;

public class _01背包 {

    public int getMaxValue(int[] weight, int[] value, int bagWeight) {
        int num = weight.length;
        int[][] dp = new int[num][bagWeight + 1];
        for (int j = 0; j < num; j++) {
            dp[j][0] = 0;
        }
        //我个人觉得可以这样初始化，后面可以测试下
//        for (int i = 1; i <= bagWeight; i++) dp[0][i] = weight[0];
        for (int i = bagWeight; i >= weight[0]; i--) {
            dp[0][i] = dp[0][i - weight[0]] + value[0];
        }
        //开始递推求解dp数组
        for (int i = 1; i < num; i++) {
            for (int j = 1; j <= bagWeight; j++) {
                if (j < weight[i]) dp[i][j] = dp[i - 1][j];
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i]] + value[i]);
            }
        }
        for (int[] cow : dp) {
            for (int tmp : cow) {
                System.out.print(tmp + " ");
            }
            System.out.println();
        }
        return dp[num - 1][bagWeight];
    }

    public int getMaxValueUseCow(int[] weight, int[] value, int bagWeight) {
        int num = weight.length;
        int[] dp = new int[bagWeight + 1];
        System.out.println();
        //开始递推求解dp数组
        for (int i = 0; i < num; i++) {
            for (int j = bagWeight; j >= weight[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
            }
            for (int tmp : dp) {
                System.out.print(tmp + " ");
            }
            System.out.println();
        }
        return dp[bagWeight];
    }

    @Test
    public void test() {
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 20};
        int bagWeight = 4;
        System.out.println("getMaxValue(weight, value, bagWeight) = " + getMaxValue(weight, value, bagWeight));
        System.out.println("value = " + getMaxValueUseCow(weight, value, bagWeight));
    }
}
