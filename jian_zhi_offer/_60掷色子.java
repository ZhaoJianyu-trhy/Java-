import org.junit.Test;

public class _60掷色子 {

    @Test
    public void test() {
        int n = 3;
        double[] doubles = twoSum(n);
        double check = 0;
        for (double aDouble : doubles) {
            check += aDouble;
        }
        System.out.println(check);
    }

    public double[] twoSum(int n) {
        if (n < 1) return new double[0];
        double appearence = Math.pow(6, n);
        int[] dp = new int[6 * n + 1];
        for (int i = 1; i <= 6; i++) dp[i] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= 6 * i; j++) {
                if (j <= 6) dp[j] = j - i + 1;
                else dp[j] = 6 * i - j + 1;
            }
        }
        double[] ans = new double[5 * n + 1];
        for (int i = n; i <= 6 * n; i++) {
            ans[i - n] = dp[i] / appearence;
        }
        return ans;
    }
}
