package two.lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object o = new Object();
        String string = o.toString();

        // tostring 반환값 출력
        System.out.println("string = " + string);
        
        // 직접 출력
        System.out.println("o = " + o);
    }
}