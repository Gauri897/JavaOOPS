class Vehicle {
    void drive() {
        System.out.println("Driving vehicle");
    }
}

class Car extends Vehicle {
    
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
