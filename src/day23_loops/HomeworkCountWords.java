package day23_loops;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class HomeworkCountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a sentence: ");
        String sentence = input.nextLine().trim();
        int space = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i)==' '){
                space++;
            }
        }
        System.out.println("There is " + (space+1) + " words in the sentence.");

    }
}
/*
Count Words
Given a sentence determine how many words are in the String.
Ex:
Input:
This has multiple words
Output:
4
 */