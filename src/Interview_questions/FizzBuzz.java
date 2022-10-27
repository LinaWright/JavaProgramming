package Interview_questions;

import java.util.Scanner;

public class FizzBuzz {
       /*

       you will have a number

       if the number is divisible by 3 print -> Fizz
       if the number is divisible by 5 print -> Buzz
       if the number is divisible by both 3 and 5 -> FizzBuzz
       if the number is not divisible by any of those, print just the number

     */
    //This is the original order, but because else if runs from top to the bottom, so when you input 15, the output is Fizz, which is also true, then
    // it'll stop running, so we can't get the output Fizzbuzz

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter an int number");
//        int number = input.nextInt();
//        if (number % 3 == 0) {
//            System.out.println("Fizz");
//        } else if (number % 5 == 0) {
//            System.out.println("Buzz");
//        } else if (number % 3 == 0 && number % 5 == 0) {
//            System.out.println("FizzBuzz");
//        } else {
//            System.out.println(number);
//        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an int number");
        int number = input.nextInt();
        if (number % 3 == 0 && number % 5 == 0){ //number%15 == 0
            System.out.println("FizzBuzz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else if (number % 3 ==0) {
            System.out.println("Fizz");
        } else {
            System.out.println(number);
        }
    }
}


