import java.util.Map;

public class Grand_Son {
    class GrandFather {
        public void thinking() {
            System.out.println("Grand Father");
        }
    }
    class Father extends GrandFather {
        public void thinking() {
            System.out.println("Father");
        }
    }
    class Son extends Father {
        public void thinking() {
            super.thinking();
        }
    }

    public static void main(String[] args) {
        (new Grand_Son().new Son()).thinking();
    }
    
}
