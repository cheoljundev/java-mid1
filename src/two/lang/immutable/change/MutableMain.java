package two.lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        obj.add(20);

        // 계산 이후의 값이 사라짐
        System.out.println("obj = " + obj.getValue());
    }
}