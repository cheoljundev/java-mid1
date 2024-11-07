package two.lang.nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested(); // 이렇게 사용할 거라면 밖으로 빼는 것이 낫다.
        nested.print();

        System.out.println("nested Class = " + nested.getClass());
    }
}
