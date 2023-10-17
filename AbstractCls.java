abstract class Car {
    abstract public void drive();

    abstract public void fly();

    public void playMusic() {
        System.out.println("Playing music...");
    }
}

// Cannot create object for abstract class.

// If we extend the normal class from abstract class, that should get those
// abstract methods.

abstract class WagonR extends Car {

    public void drive() {
        System.out.println("Driving...");
    }
}

class UpdatedWagonR extends WagonR { // Concrete class

    public void fly() {
        System.out.println("Flying...");
    };

}

public class AbstractCls {
    public static void main(String[] args) {
        WagonR car = new UpdatedWagonR(); // You can't create object of abstract class // We can create a class from
                                          // concrete class
                                          // Which should also implement all the abstract methods
        car.drive();
        car.playMusic();
        car.fly();
    }
}
