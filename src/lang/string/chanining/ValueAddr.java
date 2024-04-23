package lang.string.chanining;

public class ValueAddr {
    private int value;

    public ValueAddr add(int addValue) {
        value += addValue;
        return this;
    }

    public int getValue() {
        return value;
    }
}
