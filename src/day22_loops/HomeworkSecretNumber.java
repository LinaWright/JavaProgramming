package day22_loops;

import java.util.Scanner;

public class HomeworkSecretNumber {
    public static void main(String[] args) {
        /*
        create a program to guess the secret number.
flow will be as follows:
define the secret number, hard coded
ask the user to guess a number
based on the guess tell them a message:

  if they guess higher than the number:
      too high

  if they guess lower than the number:
      too low

  if they guess the number:
      you guessed correctly

      -> this will stop the guessing flow

Challenge: keep track of the number of attempts taken to guess right
         */

        int secretNum = 5;
        int attempts = 1;
        int num;

        do{
            Scanner input = new Scanner(System.in);
            System.out.print("guess the secret number: ");
            num = input.nextInt();

            if(num == secretNum){
                System.out.println("you guessed correctly, attempts: " + attempts);
            } else if(num < secretNum){
                System.out.println("too low, attempts: " + attempts);
            } else{
                System.out.println("too high, attempts: " + attempts);
            }

            attempts++;

        } while (secretNum != num);

    }
}
/* saim's code
Scanner input = new Scanner(System.in);
        int secretNumber = 80; // in the future we will learn how to make random numbers
        int guess;

        do {

            System.out.println("Guess a number from 1-100");
            guess = input.nextInt();

            if(guess > secretNumber){
                System.out.println(guess + " is too high");
            } else if(guess < secretNumber){
                System.out.println(guess + " is too low");
            }

        } while(guess != secretNumber); // the loop will continue if you guess wrong, because the guess is not equal to the secret number

        System.out.println("You guessed correct");
 */
