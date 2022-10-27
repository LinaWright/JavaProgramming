package day13_if_statements;

import java.util.Scanner;

public class Replit2 {
//    Use an if statement to determine if the given int number is even or odd. Print the following message:
//    $number is even_or_odd
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        }
        if (number % 2 == 1 || number % 2 == -1) {
            System.out.println(number + " is odd");
        }

    }
}
