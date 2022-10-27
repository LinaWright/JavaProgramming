package day25_Recap;

import java.util.Scanner;

public class HomeworkPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;
        for (int i = 1; i <=number ; i++) {
           if(number%i==0){
               count++;
           }
        }
        if(count>2) {
            System.out.println("not prime");
        }else{
            System.out.println("prime");
        }
    }
}
/*

  Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        boolean isPrime = number >= 2;

        // this loop is tyring to check if our number is evenly divisible by value from 2 to the number

        for(int i = 2; i < number; i++){

            if(number % i == 0){
                isPrime = false;
                break;
            }

        }

        if(isPrime){
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }

[IQ] Prime number [Loops]

Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.

Ex:
	Input:
		11

	Output:
		prime


Ex:
	Input:
		10

	Output:
		not prime
 */