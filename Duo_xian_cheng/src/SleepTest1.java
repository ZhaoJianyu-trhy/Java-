import java.util.Stack;

public class SleepTest1 {

    public static void main(String[] args) {
        String s = "a";
        StringBuilder ss = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        s.toString();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("value: " + i);
            }
        });
        t1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("睡眠了5秒");
    }
}
