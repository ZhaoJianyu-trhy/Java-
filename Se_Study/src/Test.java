public class Test {
    public void tt(StringBuilder sb, int i) {
        if (i == 1) sb.append(1);
        else sb.append(0);
    }

    @org.junit.Test
    public void test1() {
        StringBuilder sb = new StringBuilder();
        tt(sb,1);
        tt(sb,1);
        tt(sb,0);
        tt(sb,0);
        System.out.println(sb.toString());
    }

    @org.junit.Test
    public void test() {
        StringBuilder sb = new StringBuilder();
        sb.insert(0, 1);
        sb.insert(0, 1);
        sb.insert(0, 1);
        sb.insert(0, 1);
        System.out.println(Integer.parseInt(sb.toString()) * 2);
    }


}
