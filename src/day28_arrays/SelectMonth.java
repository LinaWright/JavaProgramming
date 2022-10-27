package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        /*
        Ask the user the month number they want, print the month name
        1-->Jan
        12-->December
        Assume only valid numbers are given, but as a challenge you can handle invalid numbers

        use Arrays
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month number");
        int number = input.nextInt();
        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November",
                "December"};

        System.out.println(month[number-1]);
    }
}
