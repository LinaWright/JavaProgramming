package day15_switch;

import java.util.Scanner;

public class Homework3Finder {
    /*
    declare and assign a month number. Bases on the below data determine what season it is and what kind of clothes to wear. You can create your own
     expectations of what kind of clothes to wear based on the month


	12, 1, 2 	--> Winter
	3, 4, 5 	--> Spring
	6, 7, 8 	--> Summer
	9, 10, 11 	--> Fall

Ex:
	2
	It is winter, so wear a winter coat, gloves and a hat
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of the month:");
        int num = input.nextInt();
        switch (num) {
            case 1:
            case 2:
            case 12:
                System.out.println("It is winter, so wear a winter coat, gloves and a hat");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It's Spring, it's warm and nice, we should go on a trip");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It's Summer, we should go to water park and have ice cream!");
            case 9:
            case 10:
            case 11:
                System.out.println("It's Fall, it's cooler outside");
                break;
            default:
                System.out.println("invalid number");
        }
    }
}
