package day12_if_statements;

import java.util.Scanner;

public class Replit {
    //    Create a Scanner object
//    Declare four int variables: inputSeconds, hours, minutes, seconds
//    Ask the user to enter the total number of seconds:
//
//    Enter seconds:
//
//    Taking the given number of total seconds calculate how many hours come from that many seconds, then how many left over minutes can come from
//    those seconds and finally how many leftover seconds there is.
//    Hint: Use % (remainder) and / operators to calculate the hours, minutes, and seconds
//
//    Ex:
//            ​
//    Enter seconds:
//            3695
//            1 hours, 1 minutes, and 35 seconds
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputSeconds, hours, minutes, seconds;
        System.out.println("please enter the total number of seconds");
        inputSeconds = input.nextInt();
        hours = inputSeconds / 3600;
        minutes = (inputSeconds % 3600) / 60;
        seconds = (inputSeconds % 3600) % 60;
        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");

    }
}
