// file "Vehicle.java"
public class Vehicle {
    double price;//ціна
    double speed;//швидкість
    int year;//рік випуску

    public Vehicle(double price, double speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public void show() {
        System.out.println("ціна " + price);
        System.out.println("швидкість " + speed);
        System.out.println("рік випуску " + year);
    }
}
class Plane extends Vehicle {
    double height;
    int passengersCount;
    public Plane(double price, double speed, int year, double height, int passengersCount) {
        super(price, speed, year);
        this.height = height;
        this.passengersCount = passengersCount;
    }
    public void show() {
        super.show();
        System.out.println("висота " + height);
        System.out.println("кількість пасажирів " + passengersCount);
    }
}
class Car extends Vehicle {
    public Car(double price, double speed, int year) {
        super(price, speed, year);
    }
}
class Ship extends Vehicle {
    int passengersCount;
    String homePort;
    public Ship(double price, double speed, int year, int passengersCount, String homePort) {
        super(price, speed, year);
        this.passengersCount = passengersCount;
        this.homePort = homePort;
    }
    public void show() {
        super.show();
        System.out.println("порт приписки " + homePort);
        System.out.println("кількість пасажирів " + passengersCount);
    }
}