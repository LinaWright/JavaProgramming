package day09_scanner;

import java.util.Scanner;

public class HomeWork7RateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        write a program for a rate calculator: RateCalculator
//        1. asks the user to enter a salary (double)
//        2. asks the user how many hours he/she works in a week (as int)
//        3. print the hourly rate (double) of the employee
//        assume that one year has 52 weeks
//        hourly rate = salary / (hours weekly * 52)

        System.out.println("Please enter your salary");
double salary = input.nextDouble();
        System.out.println("Please enter how many hours you work in a week");
        int hours = input.nextInt();
        double rate = salary / (hours * 52);
        System.out.println("This is your hourly rate: " + rate);


    }

}
