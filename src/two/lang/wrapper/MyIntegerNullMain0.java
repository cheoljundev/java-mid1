package two.lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1)); // 문제 발생. -1은 찾아도 -1을 반환함.
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 5));
    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }

        return -1; // null을 반환하면 더 좋겠다.
    }
}
