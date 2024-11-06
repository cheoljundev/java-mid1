package two.lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intArr = {
                new MyInteger(-1),
                new MyInteger(0),
                new MyInteger(1),
                new MyInteger(2),
                new MyInteger(3),
        };
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 5)); // null 반환
    }

    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null;
    }
}
