package day09_scanner;

import java.util.Scanner;
//Write a program that asks the user to enter a price and quantity and then calculate the revenue. revenue = price × quantity.
public class HomeWork1Revenue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Make a Scanner variable
        //popular names fot Scanner: scan, input, scanner, keyboard
        System.out.println("Enter a price");
        double price = input.nextDouble();
        System.out.println("Enter a quantity");
        int quantity = input.nextInt();
        double revenue = price * quantity;
        System.out.println("What is the revenue: $" + revenue);

    }
}








