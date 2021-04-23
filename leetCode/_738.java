import org.junit.Test;

public class _738 {

    public int monotoneIncreasingDigits(int N) {
        for (int i = N; i >= 0; i--) {
            if (check(i)) return i;
        }
        return 0;
    }
    private boolean check(int n) {
        int max = 10;
        while (n > 0) {
            int tmp = n % 10;
            if (max >= tmp) max = tmp;
            else return false;
            n /= 10;
        }
        return true;
    }

    @Test
    public void test() {
        int digits = monotoneIncreasingDigits(747131058);
        System.out.println("digits = " + digits);
    }
}
