// Interface: defines driving behavior
interface Drivable {
    void drive();  // All vehicles must implement this
}

// Abstract class: base class for all vehicles
abstract class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method
    abstract void fuelType();

    // Concrete method
    public void showBrand() {
        System.out.println("Vehicle Brand: " + brand);
    }
}

// Subclass: Car extends Vehicle and implements Drivable
class Car extends Vehicle implements Drivable {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void drive() {
        System.out.println("Car is driving on the road.");
    }

    @Override
    void fuelType() {
        System.out.println("Car uses petrol.");
    }
}

// Subclass: ElectricBike extends Vehicle and implements Drivable
class ElectricBike extends Vehicle implements Drivable {

    public ElectricBike(String brand) {
        super(brand);
    }

    @Override
    public void drive() {
        System.out.println("Electric bike is gliding silently.");
    }

    @Override
    void fuelType() {
        System.out.println("Electric bike uses battery power.");
    }
}

// Main class
public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        car.showBrand();
        ((Drivable) car).drive();
        car.fuelType();

        System.out.println();

        Vehicle ebike = new ElectricBike("Tesla");
        ebike.showBrand();
        ((Drivable) ebike).drive();
        ebike.fuelType();
    }
}
