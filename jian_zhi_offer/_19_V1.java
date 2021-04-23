public class _19_V1 {

    public boolean isMatch(String s, String p) {
        int sL = s.length(), pL = p.length();
        boolean[][] dp = new boolean[sL + 1][pL + 1];
        dp[0][0] = true;//空正则串能够表示空字符串
        for (int i = 0; i <= sL; i++) {
            for (int j = 0; j <= pL; j++) {
                if (j > 0) {//正则串不是空串的情况下
                    //非空正则串末尾分为两种情况，*和不是*
                    if (p.charAt(j - 1) != '*') {
                        if (i > 0 && (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1))) dp[i][j] = dp[i - 1][j - 1];
                    } else {//末尾是*的时候
                        //方式1，直接忽略正则串的末尾两个字符
                        if (i > 0 && j >= 2) dp[i][j] |= dp[i][j - 2];

                        if (i > 0 && j >= 2 && (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1))) dp[i][j] |= dp[i - 1][j];
                    }
                }
            }
        }
        return dp[sL][pL];
    }
}
