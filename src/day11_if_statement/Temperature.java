package day11_if_statement;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        /*Task:
        ask the user to enter the temperature

        if the temperature is above or equal to 70
        print: Its a nice day
        Go outside, but with your laptop to code java
        if the temperature if less than 70
        print: Its too cold
        Code more java
                */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the temperature");
        int temperature = input.nextInt();
        if(temperature>=70){
            System.out.println("Go outside, but with your laptop to code java");
        }else{
            System.out.println("Its too cold");
            System.out.println("Code more Java");
        }
    }

}
