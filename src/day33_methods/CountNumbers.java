package day33_methods;

import java.util.Scanner;

public class CountNumbers {
    /*
    count up to a certain number
    start from 0
    start the number until the number input

    method(5) --> 0 1 2 3 4 5

    method(10) --> 0 1 2 ... 10
    */

    public static void countNumbers (int num){
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        countNumbers(10);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        countNumbers(input.nextInt());
    }
}
