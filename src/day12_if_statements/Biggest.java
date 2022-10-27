package day12_if_statements;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
//        declare and assign 3 int variables
//        between the 3 numbers find the print the biggest one
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 numbers, use enter after each");
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
//        int a = 1; hard coded
//        int b = 2;
//        int c = 3;
        if(a>=b && a>=c){
            System.out.println(a);
        }else if(b>=a && b>=c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
