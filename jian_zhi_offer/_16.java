public class _16 {
    public double myPow(double x, int n) {
        //如果n等于0，直接返回1
        if (n == 0)
            return 1;
        //如果n小于0，把它改为正数
        if (n < 0)
            return myPow(1 / x, -n);
        //根据n是奇数还是偶数来做不同的处理
        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }

    public static void main(String[] args) {
        _16 v = new _16();
        double ans = v.myPow(2, 4);
        System.out.println(ans);
    }
}
