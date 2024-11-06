package two.lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 생성자 방식은 미래에 삭제 예정, valueOf 사용 권장
        Integer integerObj = Integer.valueOf(10); // -128 ~ 127까지 자주 사용하는 숫자를 재사용해서 최적화함.
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        System.out.println("integerObj.intValue() = " + integerObj.intValue());

        System.out.println("비교");
        System.out.println("== : " + (newInteger == integerObj));
        System.out.println("equals : " + newInteger.equals(integerObj));
    }
}
