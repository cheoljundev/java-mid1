package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int length = 0;
        for (String string : arr) {
            length += string.length();
        }
        System.out.println(length);
    }
}
