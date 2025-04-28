abstract class Vehicle {
    abstract void move();

    void stop() {
        System.out.println("Stopping...");
    }
}

class Car extends Vehicle {
    void move() {
        System.out.println("Car is moving...");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Car c = new Car();
        c.move();
        c.stop();
    }
}
