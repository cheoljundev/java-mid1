package one.lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1 : " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2 : " + isSame(str3, str4));
    }

    private static boolean isSame(String x, String y) {
//        return x == y; // 메서드를 사용하는 개발자 입장에서는, 이 문자열들이 어떻게 생성되었는지 모르므로 항상 equals()사용.
        return x.equals(y);
    }
}
