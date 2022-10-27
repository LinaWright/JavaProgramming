package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class HomeworkLongestWithA {
    /*
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
        System.out.println("Enter three words:");
        String wordOne = input.next().toLowerCase();
        String wordTwo = input.next().toLowerCase();
        String wordThree = input.next().toLowerCase();

        String longestWord = "";

        if (wordOne.contains("a") && wordOne.length() > longestWord.length()) {
            longestWord = wordOne;
        }

        if (wordTwo.contains("a") && wordTwo.length() > longestWord.length()) {
            longestWord = wordTwo;

        }

        if (wordThree.contains("a") && wordThree.length() > longestWord.length()) {
            longestWord = wordThree;
        }

        System.out.println(longestWord.isEmpty() ? "No single largest word with a" : longestWord + " is the longest word with a"); //Ternary

    }
}
