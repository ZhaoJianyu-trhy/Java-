public class _14 {
    public static int cuttingRope(int n) {
        if (n < 2) return 0;
        if (n == 2) return 1;
        if (n == 3) return 2;
        if (n == 4) return 4;
        int[] tmp = new int[n + 1];//总共有多少段
        tmp[2] = 1;
        tmp[3] = 2;
        tmp[4] = 4;
        for (int i = 5; i <= n; i++) {
            int max = 0;
            for (int j = 2; j < i; j++) {
                int tmpMax = tmp[i - j] * tmp[j];
                if (max < tmpMax) max = tmpMax;
            }
            tmp[i] = max;
        }
        return tmp[n];
    }

    public static void main(String[] args) {
        int ans = cuttingRope(12);
        System.out.println(ans);
    }
}
