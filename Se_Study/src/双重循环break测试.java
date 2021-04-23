public class 双重循环break测试 {

    public static void main(String[] args) {
        int[] dp = {0, 1, 0};
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] == 1) {
                for (int j = i; j < dp.length; j++) {
                    dp[j] = -1;
                }
                break;
            } else {
                dp[i] = 1;
            }
        }
    }
}
