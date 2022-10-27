package group_task.task1;

import java.util.Scanner;

public class T01_EvenOrOdd {

    public static void EvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = scan.nextInt();
        //EvenOrOdd(5);
        //EvenOrOdd(6);
        EvenOrOdd(num);
    }
}
/*
1) Numbers - odd & even
Write a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
 */