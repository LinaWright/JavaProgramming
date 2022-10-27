package day22_loops;

import java.util.Scanner;

public class ReplitHashtags {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char hashtag = '#';
        int howMany = 0;
        while(howMany<n){
            System.out.print(hashtag);
            howMany++;
        }
    }
}
/*
Use a loop to print a hashtag # for n times. The n value is how many hashtags should be on the same line, in the output.
Main topics: loops, primitive datatypes, operators, Scanner, String

Ex:
  Input:
    3

  Output:
    ###
Ex:
  Input:
    5
    ​
  Output:
    #####
 */