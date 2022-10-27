package day15_switch;

import java.util.Scanner;

public class Homework2DayInMonth {
    /*
    Days In Month (slightly different version than before)

Write a program that will accept a month name and outputs how many days are in that month

data:

    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the month");
        String month = input.nextLine();
        switch(month){
            case"January":
            case"March":
            case"May":
            case"July":
            case"August":
            case"October":
            case"December":
                System.out.println("There are 31 days in this month");
                break;
            case"April":
            case"June":
            case"September":
            case"november":
                System.out.println("There are 30 days in this month");
                break;
            case"February":
                System.out.println("There are 28 days in this month");
                break;
            default:
                System.out.println("You have entered invalid month, please try again");
        }
    }
}
