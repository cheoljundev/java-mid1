package two.lang.nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버에 접근
            // System.out.println(outInstanceValue); // 접근 불가

            // 바깥 클래스의 클래스 멤버에는 private도 접근이 가능하다.
            System.out.println(outClassValue);
        }
    }
}
