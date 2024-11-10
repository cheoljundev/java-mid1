package two.enummeration.ref3;

import static two.enummeration.ref3.Grade.*;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;

        System.out.println("BASIC 등급의 할인금액 : " + BASIC.discount(price));
        System.out.println("GOLD 등급의 할인금액 : " + GOLD.discount(price));
        System.out.println("DIAMOND 등급의 할인금액 : " + DIAMOND.discount(price));
    }
}
