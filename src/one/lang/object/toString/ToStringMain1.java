package one.lang.object.toString;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        // toString() 반환값 출력
        System.out.println(string); // java.one.lang.Object@a09ee92

        // object 직접 출력
        System.out.println(object); // java.one.lang.Object@a09ee92
    }
}