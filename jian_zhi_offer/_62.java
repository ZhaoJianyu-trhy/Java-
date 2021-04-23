

import org.junit.Test;

import java.util.*;

public class _62 {

    @Test
    public void mod() {
        System.out.println(-5 % 3);
    }
    public static void main(String[] args) {

        System.out.println(lastRemaining(56795, 87778));
    }
    public static int lastRemaining(int n, int m) {
        int dele = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        while (list.size() != 1) {
            dele = (dele + m - 1) % list.size();
            list.remove(dele);
        }
        return list.get(0);
    }
}
