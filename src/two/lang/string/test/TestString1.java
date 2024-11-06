package two.lang.string.test;

public class TestString1 {
    public static void main(String[] args) {
        String url = "https://www.example.com";
        // 코드 작성
        boolean isHttps = isHttps(url);
        System.out.println("isHttps = " + isHttps);
    }

    private static boolean isHttps(String url) {
        return url.startsWith("https");
    }
}
