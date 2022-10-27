package day08_relational_operator;

public class HomeWork2GallonsToLiters {
    public static void main(String[] args) {
//        create a class called GallonsToLiters, and write a program that can convert the gallons to litters
//                Ex:
//        gallon = 10;
//        output:
//        10 gallons equal to 37.8541 liters
//                gallon = 20
//        output:
//        20 gallons equal to 75.7082 liters
        int gallon = 10;
        double gallonsToLiters = 3.78541;
        double liters = gallon * gallonsToLiters;
        System.out.println("10 gallon equals " + liters + " liters");
        int gallon2 = 20;
        double liters2 = gallon2 * gallonsToLiters;
        System.out.println("20 gallon equals " + liters2 + " liters");

    }

}
