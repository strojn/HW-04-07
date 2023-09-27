// file "Main.java"
//Створіть проект з класом Main.java.
//
//        Створити клас Vehicle.
//        У тілі класу створіть поля: координати та параметри суден (ціна, швидкість, рік випуску).
//        Створіть 3 похідних класи Plane, Саг та Ship.
//        Для класу Plane має бути визначена висота та кількість пасажирів.
//        Для класу Ship – кількість пасажирів та порт приписки.
//        Написати програму, яка виводить на екран інформацію про кожен засіб пересування.
public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(1000000, 500, 2014, 900, 50);
        System.out.println("\nЛітак:");
        plane.show();

        Car car = new Car(15000, 180, 2015);
        System.out.println("\nАвтомобіль:");
        car.show();

        Ship ship = new Ship(500000, 50, 2016, 100, "Одеса");
        System.out.println("\nЧовен:");
        ship.show();
    }
}