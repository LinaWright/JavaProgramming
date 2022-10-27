package day37_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {
        String year = "2022";

        //Normal concatenation
        System.out.println("This year " + year);
        System.out.println("Next year will be " + (year +1)); //Next year will be 20221

        int numYear = Integer.parseInt(year);
        System.out.println("This year " + numYear);
        System.out.println("Next year will be " + (numYear +1)); //Next year will be 2023

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message: I am X years old");
        String str = input.nextLine(); // I am X years old
        //in 5 years you'll be $ageIn5Years

        String agePart = str.split(" ")[2];
        int age = Integer.parseInt(agePart);
        System.out.println("In five years, you will be " + (age + 5));

    }
}
