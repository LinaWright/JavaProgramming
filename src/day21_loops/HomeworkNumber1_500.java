package day21_loops;

import java.util.Scanner;

public class HomeworkNumber1_500 {
    /*
    write a program that will add all the numbers from 1 - 500
    */
    public static void main(String[] args) {
        int num = 1;
        int totalNumber = 0;
        while(num<500){
            totalNumber += num; // totalNumber = totalNumber + num;
            num++;
            System.out.println(totalNumber + "+" +num);
        }
        System.out.println(totalNumber);
    }

}
