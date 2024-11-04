package one.enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = " +  Grade.BASIC.getClass());
        System.out.println("class GOLD = " +  Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " +  Grade.DIAMOND.getClass());

        // System.out.println("ref BASIC = " + Grade.BASIC); // toString이 오버라이딩되어 이름이 나타난다.
         System.out.println("ref BASIC = " + refValue(Grade.BASIC));
         System.out.println("ref GOLD = " + refValue(Grade.GOLD));
         System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
    }

    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}