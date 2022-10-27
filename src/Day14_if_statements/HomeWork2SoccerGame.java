package Day14_if_statements;

import java.util.Scanner;

public class HomeWork2SoccerGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the time left:");
        int minLeft = input.nextInt();
        if(minLeft>=75 && minLeft<=90) {
            System.out.println("just getting started");
        }else if(minLeft>=60 && minLeft<=74){
            System.out.println("players are doing their best");
        }else if(minLeft>=30 && minLeft<=59){
            System.out.println("players are doing their best");
        }else if(minLeft>=0 && minLeft<=29){
            System.out.println("the end of the same is approaching");
        }else{
            if(minLeft <0) {
                System.out.println("minutes cannot be a negative number");
            }else{
                System.out.println("games cannot be longer than 90 minutes");
            }
        }
    }
    /*
    declare and assign a minutes variable
use the minutes value to determine how much time is left in the soccer game

use these ranges to determine the outputs:

	- any number less than 0 and more than 90 are not valid:

		when the minutes is less than 0:
			print: minutes cannot be a negative number
		when the minutes is more than 90:
			print: games cannot be longer than 90 minutes

	- when the minutes are between 90 - 75
		print: just getting started

	- when the minutes are between 74 - 60
		print: players are doing their best

	- when the minutes are between 59 - 30
		print: middle of the game is going great

	- when the minutes are between 29 - 0
		print: the end of the same is approaching
     */
}
