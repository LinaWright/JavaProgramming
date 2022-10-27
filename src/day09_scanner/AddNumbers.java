package day09_scanner;
import java.util.Scanner;
public class AddNumbers {
       /*
        create Scanner object
        ask the user to enter 3 numbers
        find and print the sum of the numbers
     */
       public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           System.out.println("Please enter 2 numbers. Hit enter after each number");
           System.out.println("Enter the first number");
           int Num1 = input.nextInt();
           System.out.println("Enter the second number");
           int Num2 = input.nextInt();
           System.out.println("Enter the third number");
           int Num3 = input.nextInt();
           int sumOfTheNumbers = Num1 + Num2 + Num3;
           System.out.println("The sum of the numbers is " + sumOfTheNumbers);
       }

}
