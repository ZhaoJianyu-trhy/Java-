
class _67 {
    int left = 0, right = 0, status = 0;

    public int strToInt(String str) {
        str = str.trim();
        if (str == null || str == "") return 0;
        if (str.charAt(0) == '+') {
            left = 1;
            right = loop(left, str);
        } else if (str.charAt(0) == '-') {
            left = 1;
            status = -1;
            right = loop(left, str);
        } else if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            right = loop(left, str);
        } else return 0;
        return getAns(str.substring(left, right), status);
    }

    private int loop(int left, String str) {
        int i = 0;
        for (i = left; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') break;
        }
        return i;
    }

    private int getAns(String str, int status) {
        double ans = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            ans += (str.charAt(i) - '0') * Math.pow(10, str.length() - 1 - i);
        }
        if (status == -1) ans = -ans;
        if (ans > Math.pow(2, 31) - 1) return new Double(Math.pow(2, 31) - 1).intValue();
        if (ans < -Math.pow(2, 31)) return new Double(-Math.pow(2, 31)).intValue();
        return new Double(ans).intValue();
    }
}
