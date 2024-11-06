package two.lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int lengthSum = 0;
        for (String string : arr) {
            System.out.println(string + " : " + string.length());
            lengthSum += string.length();
        }
        System.out.println("lengthSum = " + lengthSum);
    }
}
