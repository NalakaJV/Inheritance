public class Vehicel {
    void drive () {
        System.out.println("Driving!");
    }
    void vehicleBreak () {
        System.out.println("Break!");
    }
    void reverse () {
        System.out.println("Reverse!");
    }
}
class Car extends Vehicel {
    void motorRacing () {
        System.out.println("Racing!");
    }
}
class ModernCar extends Car {
    void flying () {
        System.out.println("Flying!");
    }
}
class Boat extends Vehicel {
    void surf () {
        System.out.printf("surfing!");
    }
}
class ModernBot extends Boat {
    void landRideing () {
        System.out.printf("Rideing!");
    }
}
class TestOutput {
    public static void main(String[] args) {
ModernCar mc = new ModernCar();
ModernBot mb = new ModernBot();
mc.drive();
mc.vehicleBreak();
mc.reverse();
mc.motorRacing();
mc.flying();
mb.drive();
mb.vehicleBreak();
mb.reverse();
mb.surf();
mb.landRideing();


    }
}
