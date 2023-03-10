package baekjoon;


public class Int {
    private int value;

    public Int(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Int{" +
                "value=" + value +
                '}';
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

