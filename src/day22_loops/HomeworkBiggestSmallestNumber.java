package day22_loops;

import java.util.Scanner;

public class HomeworkBiggestSmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the first number: ");
        int number = input.nextInt();
        int times = 0;
        int biggestNum = number;
        int smallestNum = number;
        do{
            System.out.println("Please, enter the next number: ");
            number = input.nextInt(); // should be exactly in this position making sure the last entered number will be compared and returned
            if(number > biggestNum){
                biggestNum = number;
            } else if(number < smallestNum){
                smallestNum = number;
            }
            times++;
        }while(times<4);
        System.out.println("The biggest number is " + biggestNum + " and the smallest one is " + smallestNum + ".");
    }
}
//write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5
/*
 Scanner input = new Scanner(System.in);


        int max = -2147483648;
        int min = 2147483647;

        int n = 0;

        while(n < 5){
            n++;

            System.out.println("Enter a number");
            int number = input.nextInt();

            if(number > max){
                max = number;
            }

            if(number < min){
                min = number;
            }

        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
 */