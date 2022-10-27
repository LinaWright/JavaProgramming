package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class LongestWithA {

    /* *********This code is to find the longest word and checks if it contains "a". This code is not going to work!!!!!!!!!!!!************

    create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word
that also contains 'a'
Ex:
"java"
"mouse"
"computer"
Output: java
Challenge: Instead of just checking for "a" add another variable that can
be used to check for any character.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three words");
        String word1 = input.next().toLowerCase(Locale.ROOT);
        String word2 = input.next().toLowerCase(Locale.ROOT);
        String word3 = input.next().toLowerCase(Locale.ROOT);

        int length1 = word1.length();
        int length2 = word2.length();
        int length3 = word3.length();

        if (word1.contains("a") && length1 > length2 && length1 > length3) {
            System.out.println(word1 + " is the biggest with a");
        } else if (word2.contains("a") && length2 > length1 && length2 > length3) {
            System.out.println(word2 + " is the biggest with a");
        } else if (word3.contains("a") && length3 > length1 && length3 > length2) {
            System.out.println(word3 + " is the biggest with a");
        } else {
            System.out.println("No single largest word with a");
        }


    }
}


