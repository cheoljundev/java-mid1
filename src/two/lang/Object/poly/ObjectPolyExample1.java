package two.lang.Object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object o) {

        // 객체에 맞는 다운캐스팅 필요
        if (o instanceof Dog dog) {
            dog.sound();
        } else if (o instanceof Car car) {
            car.move();
        }
    }
}
