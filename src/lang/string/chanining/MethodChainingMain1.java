package lang.string.chanining;

public class MethodChainingMain1 {
    public static void main(String[] args) {
        ValueAddr addr = new ValueAddr();
        addr.add(1);
        addr.add(2);
        addr.add(3);

        int result = addr.getValue();

        System.out.println("result = " + result);
    }
}
