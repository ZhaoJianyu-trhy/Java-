public class _67_v1 {
    public static void main(String[] args) {
        String test = "2147483646";
        int i = strToInt(test);
        System.out.println(i);
    }
    public static int strToInt(String str) {
        if (str == null || str.equals("")) return 0;
        int start = 0, check = Integer.MAX_VALUE / 10;
        boolean flag = true;//用于标记是整数还是负数
        //先找到第一个不是空格的字符
        while (str.charAt(start) == ' ') start++;
        if (str.charAt(start) == '+') start++;
        else if (str.charAt(start) == '-') {
            flag = false;
            start++;
        }
        int ans = 0;
        //这个时候已经到了有效数字部分了
        while (start < str.length() && (str.charAt(start) >= '0' && str.charAt(start) <= '9')) {
            if ((ans == check && str.charAt(start) > '7') || ans > check)
                return flag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            ans = ans * 10 + str.charAt(start) - '0';
            start++;
        }
        return flag ? ans : -ans;
    }
}
