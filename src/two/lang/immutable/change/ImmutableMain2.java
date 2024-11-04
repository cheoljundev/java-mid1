package two.lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20); // 리턴값 버림

        System.out.println("obj1 = " + obj1.getValue()); // 그대로 10
    }
}
