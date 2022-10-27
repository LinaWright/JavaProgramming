package day09_scanner;

import java.util.Scanner;

public class HomeWork6EvenOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Ask the user to enter an int number. Determine if the number is even or odd
//        Print a boolean for both even and odd
        System.out.println("Please enter an int number ");
int number = input.nextInt();
boolean isAnEvenNumber = number%2==0;
        boolean isAnOddNumber = number%2==1; // Or boolean isAnOddNumber = number%2 != 0; or Or boolean isAnOddNumber =!isEven
        System.out.println("Is the number an even number: " + isAnEvenNumber);
        System.out.println("Is the number an odd number: " + isAnOddNumber);
    }

}
