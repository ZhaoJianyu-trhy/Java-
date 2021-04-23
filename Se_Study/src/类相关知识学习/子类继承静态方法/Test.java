package 类相关知识学习.子类继承静态方法;

public class Test {

    public static void main(String[] args) {
        Father son = new Son();
        son.show();
        Son.staticShow();
        Father.staticShow();
    }
}
