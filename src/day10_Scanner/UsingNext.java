package day10_Scanner;

import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What day is it today?");
        String day = input.nextLine();

        System.out.println("Enter your first name" );
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next(); //to send this data you need to hit enter

        input.nextLine(); //the enter input from the line above is absorbed here,don't need a variable

        System.out.println("What is your address");  //input.nextLine();, it'll take enter as an input
        //Problem Whenever we use nextLine()Method after any other Scanner methods the input is consumed by the Enter from the previous input
        //solution: add a nextLine() just to handle the enter input, then you can use nextLine() to read a String value
        String address = input.nextLine();

    }
}
