package one.enumeration.ref1;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    private final int dicountPercent;

    // private 생성자 추가
    private ClassGrade(int dicountPercent) {
        this.dicountPercent = dicountPercent;
    }

    public int getDicountPercent() {
        return dicountPercent;
    }
}
