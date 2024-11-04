package one.lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스 공유 가능
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 참조값 대입을 막을 수는 없다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        b.setValue("부산"); // setValue() 메서드가 없으므로 변경 불가능. 새로운 인스턴스를 참조해야 함.
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
