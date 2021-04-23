import java.util.ArrayList;
import java.util.List;

public class _60 {

    public static double[] getAns(int num) {
       int[][] ans = new int[num + 1][5 * num + 2];
       double[] tans = new double[5 * num + 1];
       for (int i = 1; i <= 6; i++) ans[1][i] = 1;
       for (int i = 2; i <= num; i++) {
           for (int j = i; j <= 6 * i; j++) {
               for (int cur = 1; cur <= 6; cur++) {
                   if ((j - cur) <= 0) break;
                   ans[i][j] += ans[i - 1][j - cur];
               }
           }
       }
       double base = Math.pow(6, num);
       for (int j = num; j <= 6 * num; j++) {
          tans[j - num] = ans[num][j];
       }
      return tans;
    }
}
