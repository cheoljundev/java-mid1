package two.lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] fruitsSplit = fruits.split(",");
        for (String string : fruitsSplit) {
            System.out.println(string);
        }
        String join = String.join("->", fruitsSplit);
        System.out.println("join = " + join);
    }
}
