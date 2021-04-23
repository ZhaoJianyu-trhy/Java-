package overload_test;

public class Dispath {
    public static void main(String[] args) {
        Human man = new Man();
        Man man1 = new Man();
        Human woman = new Woman();
        System.out.println(man.s);
        System.out.println(man1.s);
        System.out.println(woman.s);
//        hello(man);
//        hello(woman);
    }
    public static void hello(Human human) {
        System.out.println("human!!!");
    }

    public static void hello(Man man) {
        System.out.println("man!!!");
    }

    public static void hello(Woman woman) {
        System.out.println("woman!!!");
    }
}
