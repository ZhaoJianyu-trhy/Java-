public class Init_Test {

    int a;
    int b;

    public Init_Test() {
        b = 2;
        a = b + 2;
    }

    @Override
    public String toString() {
        return "Init_Test{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
