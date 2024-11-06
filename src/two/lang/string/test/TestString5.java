package two.lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int dotIndex = str.indexOf(".");
        String fileName = str.substring(0, dotIndex);
        String extName = str.substring(dotIndex);
        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);
    }
}
