package day43_custome_classes;

import day43_custome_classes.Car;

public class UseCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);

        car1.model = "Chiron";
        car1.color = "Black";
        car1.year = 2022;
        car1.fuelLevel = 80;

        System.out.println();
        System.out.println(car1);

        car1.drive();
        car1.drive();

        System.out.println(car1.fuelLevel);

        System.out.println();
        car1.fillTank();
        System.out.println(car1.fuelLevel);
    }
}
