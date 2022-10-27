package day15_switch;

import java.util.Scanner;

public class Homework1Elevator {
    /*
    declare and assign a floor number variable. The floor number represent which floor you want the elevator to go to. After getting to each floor
    show the information of which companies are on that floor. Use the following data:

	floor 1 --> Lobby, StarBucks, Amazon Pick Up
	floor 2 --> NASA, Cydeo, Discover
	floor 3 --> Uber, Lyft, Chase
	floor 4 --> Rooftop, Lounge

	any other floor value --> Invalid Floor Selected

     */
    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);
        System.out.println("Please enter your floor number");
        int num = inout.nextInt();
        switch (num){
            case 1:
                System.out.println("Lobby, StarBucks, Amazon Pick Up");
                break;
            case 2:
                System.out.println("NASA, Cydeo, Discover");
                break;
            case 3:
                System.out.println("Uber, Lyft, Chase");
            case 4:
                System.out.println("Rooftop, Lounge");
            default:
                System.out.println("Invalid Floor Selected");
        }
    }
}
