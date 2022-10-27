package day22_loops;

import java.util.Scanner;

public class ReplitFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int total = 1;
        while(n>1){  //3 2
//            total *= n;
            total = total * n; //3 *2
            n--; //2 1
        }
        System.out.println(total);
    }
}

/*
Use a loop to calculate the factorial of the given number n. In mathematics a factorial number is a positive integer that is the product of all the
positive integers less than or equal to the n number. It is commonly written as n! In other words, a factorial value is the number multiplied to the
number less than it, multiplied by the number less than it, repeating until 1. See the examples for clarification.
Main topics: loops, primitive datatypes, operators, Scanner

Ex:
  Input:
    5

  Output:
    120

  -> The calculation would be:
    5 * 4 * 3 * 2 * 1 = 120
Ex:
  Input:
    8
    ​
  Output:
    40320
    ​
  -> The calculation would be:
    8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 = 40320
 */