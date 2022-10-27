package day09_scanner;

import java.util.Scanner;

public class HomeWork8Order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Challenge for today: Try it yourself and see otherwise we will go through it together.
//
//        - Place an order
//        - Ask the user to enter the product name (String, multiple words)
//                - Ask the user to enter the price (double)
//                - Ask the user to enter the quantity(int)
//                - Ask the user to enter their full name (String, multiple word)
//                - Print in the following format:
//        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
//        Ex:
//        Input: "Apples" , 1.5, 5. "Luke"
//        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.

        System.out.println("Enter the product name");
        String nameOfProduct = input.nextLine();

        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = input.nextInt();
        double totalCost = price * quantity;

        input.nextLine(); //This will grab the enter input from the above line

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println(fullName + " your order for " + quantity + " " + nameOfProduct + " has been placed. Your total is " + totalCost);


    }

}
