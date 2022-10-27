package day12_if_statements;

import java.util.Scanner;

public class Homework1Driver {

//    create a class Diver
//
//You are diving in the ocean. Your oxygen tank has a certain level (number)
//
//    declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:
//
//    Above 90 - Your tank is full
//    Above 80 - Still okay
//    Above 70 - Don't go too far
//    Above 60 - Start to head back
//    Above 50 - Be careful now you at at 50%

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your oxygen level");
        int oxygenLevel = input.nextInt();
        if(oxygenLevel>90){
            System.out.println("Your tank is full");
        }else if(oxygenLevel>80){
            System.out.println("Still okay");
        }else if(oxygenLevel>70){
            System.out.println("Don't go too far");
        }else if(oxygenLevel>60){
            System.out.println("Start to head back");
        }else if(oxygenLevel>50){
            System.out.println("Be careful now you at at 50%");
        }else{
            System.out.println("Dangerous");
        }
    }
}
//Saim's code
//    String message;
//
//        if(oxygenLevel > 90){
//                message = "Your tank is full";
//                } else if (oxygenLevel > 80){  // else if(oxygenLevel > 80 && oxygenLevel <= 90)
//                message = "Still okay";
//                } else if(oxygenLevel > 70){
//                message = "Don't go too far";
//                } else if(oxygenLevel > 60){
//                message = "Start to head back";
//                } else if(oxygenLevel > 50){
//                message = "Be careful now you are at 50%";
//                } else {
//                message = "Dangerous";
//                }
//
//                System.out.println(message);