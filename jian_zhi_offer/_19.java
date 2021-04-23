/*public class _19 {
    public boolean isMatch(String s, String p) {
        int sL = s.length(), pL = p.length();
        boolean[][] f = new boolean[sL + 1][pL + 1];
        f[0][0] = true;
        for (int i = 0; i <= sL; i++) {
            for (int j = 0; j <= pL; j++) {
                if (i >= 1 && j >= 1) {//均不为空串的时候
                    if (p.charAt(j - 1) != '*') {//正则串末尾不是*
                        if (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(j - 1)) {//末尾是.，或正则串末尾是正常字符且与源串末尾字符相等
                            f[i][j] = f[i - 1][j - 1];
                        }
                    } else {//正则串末尾是*
                        //分为两种情况，直接忽视掉*和它前面的一个字符,或者一个一个排除源串的末尾一个字符，因为*可以代表多个字符
                        if (j >= 2 && s.charAt(i - 1) != p.charAt(j - 2)) {
                            f[i][j] |= f[i][j - 2];//此处用|,是为了把两种情况的结果都考虑进去
                        }

                        if (j >= 2 && s.charAt(i - 1) == p.charAt(j - 2)) {
                            f[i][j] |= f[i - 1][j];
                        }
                    }
                } else if (i == 0 && j > 0){//源串是空，正则串不为空
                    if (p.charAt(j - 1) )
                }
            }
        }
        return f[sL][pL];
    }
}*/
