import org.junit.Test;

public class _17打印从1到最大的N位数 {

    StringBuilder str;
    char[] character = {'0', '1', '2', '3', '4', '5', '6', '7', '8' ,'9'}, tmp;
    int target, nine, start, index;
    public String printNumbers(int n) {
        tmp = new char[n];
        str = new StringBuilder();
        target = n;
        start = n - 1;
        dfs(0);
        return str.deleteCharAt(str.length() - 1).toString();
    }

    private void dfs(int x) {
        if (x == target) {
            String add = String.valueOf(tmp).substring(start);
            if (add.equals("0")) return;
            str.append(add).append(",");
            if (target - start == nine) start--;
            return;
        }
        for (char c : character) {
            tmp[x] = c;
            if (c == '9') {
                nine++;
            }
            dfs(x + 1);
        }
        nine--;
    }

    @Test
    public void test() {
        String s = printNumbers(3);
        System.out.println(s);
    }
}
