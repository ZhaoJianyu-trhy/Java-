package 生产者消费者;

public class PCData {
    private final int intData;

    public PCData(int intData) {
        this.intData = intData;
    }

    public PCData(String d) {
        this.intData = Integer.valueOf(d);
    }

    public int getData() {
        return intData;
    }

    @Override
    public String toString() {
        return "data: " + intData;
    }
}
