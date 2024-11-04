package one.lang.string.chanining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAddr addr = new ValueAddr();
        ValueAddr addr1 = addr.add(1);
        ValueAddr addr2 = addr.add(2);
        ValueAddr addr3 = addr.add(3);

        int result = addr3.getValue();

        System.out.println("result = " + result);

        System.out.println("addr = " + addr);
        System.out.println("addr1 = " + addr1);
        System.out.println("addr2 = " + addr2);
        System.out.println("addr3 = " + addr3);
    }
}
