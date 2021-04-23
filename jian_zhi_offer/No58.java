

import org.junit.Test;

import java.util.Arrays;

public class No58 {


    @Test
    public void t1() {
        String s = "abcdef";
        int n = 2;
        StringBuilder res = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            res.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            res.append(s.charAt(i));
        }
        System.out.println(res.toString());
    }
    @Test
    public void test() {
        String s = "12345";
        StringBuilder res = new StringBuilder();
        res.append(s);
        String s1 = "hehe";
        res.append(s1);
        System.out.println(res.toString().trim());
    }

    public static String reverse(String test) {
        char[] tmp = test.toCharArray();
        char temp;
        int i = 0, j = tmp.length - 1;
        while (i < j) {
            temp = tmp[i];
            tmp[i] = tmp[j];
            tmp[j] = temp;
            i++;
            j--;
        }
        String res = String.valueOf(tmp);
        return res;
    }

    public static void main(String[] args) {

        String s = "I am a student.And you ?";
        char[] tmp = s.toCharArray();
        int i = 0, j = 0;
        while (!(tmp[i] >= 'a' && tmp[i] <= 'z')) {
            i++;
        }
        j = i + 1;
        while ((tmp[j] >= 'a' && tmp[j] <= 'z')) {
            j++;
        }
        System.out.println(reverse(s));
        System.out.println(reverse(s.substring(i, j)));
    }
}

