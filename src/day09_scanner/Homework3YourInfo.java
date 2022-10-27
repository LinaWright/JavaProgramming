package day09_scanner;

import java.util.Scanner;

public class Homework3YourInfo {
//    Ask the user to enter their age (byte),
//    ask them to enter their favorite number (long),
//    and ask them to enter their favorite book
//    Print all the values from the inputs
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the name of your favorite book");
    String nameOfTheBook = input.nextLine();
    System.out.println("Please enter your age");
    int age = input.nextInt();
    System.out.println("Please enter your favorite number");
    int num = input.nextInt();
    System.out.println("I'm " + age  + " years old, my favorite number is: " + num + " and my favorite book is " + nameOfTheBook);


}




}
