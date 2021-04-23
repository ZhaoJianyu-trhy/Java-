

import org.junit.Test;

import java.util.Arrays;

public class UglyNumber {

    public boolean isUglyNumber(int num) {
        while (num % 2 == 0) {
            num = num / 2;
        }
        while (num % 3 == 0) {
            num = num / 3;
        }
        while (num % 5 == 0) {
            num = num / 5;
        }
        if (num == 1) return true;
        else return false;
    }

    /*public int getUglyNumber(int targetIndex) {
        int count = 0, num = 0;
        while (count != targetIndex) {
            if (isUglyNumber(num)) count++;
            num++;
        }
        return num;
    }*/

    public int getUglyNumber(int targetIndex) {
        int[] dp = new int[targetIndex];
        int a = 0, b = 0, c = 0;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Math.min(Math.min(a * 2, b * 3), c * 5);
            if (dp[i] == a * 2) a++;
            if (dp[i] == b * 3) b++;
            if (dp[i] == c * 5) c++;
        }
        return dp[targetIndex - 1];
    }

    @Test
    public void run() {
        int[] a = new int[10];
        System.out.println(Arrays.toString(a));
    }
}
