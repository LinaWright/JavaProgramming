package day11_if_statement;

import java.util.Scanner;

public class Homework2 {
    //    create an int value for the time of the day. Use a 24 hour format
//    use the given time of day to display a message
//    hint: use seperate if statements
//
//	if the hours are from 6 - 11, print: Good morning
//	if the hours are from 12 - 16, print: Good evening
//	if the hours are from 17 - 23, print: Good night
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an int number using 24 hour format:");
        int time = input.nextInt();
        if ((time <= 11) && (time >= 6)) {
            System.out.println("Good morning");
        }
        if ((time <= 16) && (time >= 12)) {
            System.out.println("Good evening");
        }
        if ((time >= 17) && (time <= 23)) {
            System.out.println("Good night");
        }


    }
}
