package two.lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스 공유 가능
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b.setValue("부산"); // setValue가 없다. 새로 인스턴스를 생성해야 한다.
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
