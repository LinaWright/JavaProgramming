package day22_loops;

public class ReplitAlphabet {
    public static void main(String[] args) {
        char bigLetter = 'A';
        while(bigLetter <= 'Z'){
            System.out.print(bigLetter);
            bigLetter++;
        }
        System.out.println();
        char smallLetter = 'z';
        while (smallLetter >= 'a'){
            System.out.print(smallLetter);
            smallLetter--;
        }
    }
}
/*
Use a loop to print the alphabet from A to Z. Print all the characters in one line, with no spaces between them.
Also use another loop to print the alphabet from z to a. Print all the character in one line, with no spaces between them.
Note: There will be two lines in the output. One of the uppercase letters from A to Z, and a second line for the lowercase letter from z to a.
Note: Do not just print the the characters as a String, use a loop to iterate through all the characters
Main topics: loops, primitive datatypes

Example Flow:

ABCDEFGHIJKLMNOPQRSTUVWXYZ
zyxwvutsrqponmlkjihgfedcba
 */