import org.junit.Test;

public class _46 {
    public int translateNum(int num) {
        if (num < 10) return 1;
        int dp0 = 1, dp1 = 1, ans = 0;
        String tmp = String.valueOf(num);
        for (int i = 1; i < tmp.length(); i++) {
            int check = 10 * (tmp.charAt(i - 1) - 48) + tmp.charAt(i) - 48;
            ans = (check <= 25 && check >= 10) ? dp0 + dp1 : dp1;
            dp0 = dp1;
            dp1 = ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        _46 v = new _46();
        int num = 25;
        int i = v.translateNum(num);
        System.out.println(i);
    }
    @Test
    public void test() {
        char s = '2'- '0';
        System.out.println(10 * s);
    }
}
