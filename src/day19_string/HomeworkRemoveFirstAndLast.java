package day19_string;

import java.util.Scanner;

public class HomeworkRemoveFirstAndLast {
    /*
    [Remove first and last]
Given two words. Print the first word without its first character then print the second word
without its last character.

Input:
apple banana
Output:
pple
banan
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstWord = input.next();
        String secondWord = input.next();
        System.out.println(firstWord.substring(1)); //substring(1), returns the String starts from index 1 which is the second letter,
        // until the end of the String
        System.out.println(secondWord.substring(0,secondWord.length()-1));
    }
}
