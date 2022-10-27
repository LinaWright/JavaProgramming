package day33_methods;

import java.util.Scanner;

public class Age {
    /*
    make a method that calculates and prints the age
    takes the birth year as an input
     */
    public static void getAge(int birthYear){
        System.out.println("You are " + (2022-birthYear) + " years old.");
    }

    public static void main(String[] args) {
        getAge(2000);

        int year = 1999;
        getAge(year);
        //using Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("What year were you born?");
        int birthYear = input.nextInt();
        getAge(birthYear);
    }
}
