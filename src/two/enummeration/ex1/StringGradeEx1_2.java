package two.enummeration.ex1;


public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급 입력
        int vip = discountService.discount("VIP", price);

        // 오타
        int diaamond = discountService.discount("DIAAMOND", price);

        // 소문자 입력
        int diamond1 = discountService.discount("diamond", price);

        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인금액 : " + basic);
        System.out.println("GOLD 등급의 할인금액 : " + gold);
        System.out.println("DIAMOND 등급의 할인금액 : " + diamond);
    }
}
