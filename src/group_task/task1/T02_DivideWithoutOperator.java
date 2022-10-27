package group_task.task1;

import java.util.Scanner;

public class T02_DivideWithoutOperator {
    public static int Divide(int num1, int num2) {
        int count = 0;

        while (num1 >= num2) {
            num1 = num1 - num2;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println("Enter the first number: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.println(Divide(num1, num2));

    }
}
/*
2) Numbers - Divide without / operator
Write a method that can divide two numbers without using division operator
 */