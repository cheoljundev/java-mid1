package lang.string.chanining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAddr addr = new ValueAddr();
        int result = addr.add(1).add(2).add(3).getValue();

        System.out.println("result = " + result);
    }
}
