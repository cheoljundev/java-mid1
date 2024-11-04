package one.lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int count = 0;
        for (String string : str.split(" ")) {
            if (string.indexOf(key) > -1) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
