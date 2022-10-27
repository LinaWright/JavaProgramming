package day11_if_statement;

import java.io.Console;
import java.util.Scanner;

public class Replit2 {
//    You will be accepting 3 numbers from the console (Using Scanner) and adding them together
//    Declare four int variables: num1, num2, num3, sum
//
//    Create a java.util.Scanner object named scan
//
//    Your program should follow this flow:
//    Console shows: Enter 3 numbers:
//
//    Using Scanner take three inputs from the console and store the values into your variables num1, num2, and num3
//
//    Add the three numbers and assign the result to the sum variable
//
//    Finally, print the following:
//
//    Sum of numbers: $ValueOfSum
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 3 numbers");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();
    System.out.println("Sum of numbers " + (num1 + num2 + num3));
}
}
