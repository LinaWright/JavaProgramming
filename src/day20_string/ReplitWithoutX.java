package day20_string;

import java.util.Locale;
import java.util.Scanner;

public class ReplitWithoutX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length() - 1);
        if (firstLetter == 'x' || firstLetter == 'X'|| lastLetter == 'x' || lastLetter == 'X') {
            if ((firstLetter == 'x' || firstLetter == 'X') && (lastLetter == 'x' || lastLetter == 'X')) {
                System.out.println(word.substring(1, word.length() - 1));
            } else {
                if (firstLetter == 'x' || firstLetter == 'X') {
                    System.out.println(word.substring(1));
                }
                if (lastLetter == 'x' || lastLetter == 'X') {
                    System.out.println(word.substring(0, word.length() - 1));
                }
            }
        }
            else {
            System.out.println(word);
        }
    }
}
/*
Use String methods to modify the given word based on the following rules:
If word starts with or ends with x or X print the String without those x characters
If there is no x or X as the first or last character print the word untouched
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

Ex:
  Input:
    xHiX
    ​
  Output:
    Hi
Ex:
  Input:
    xHiX

  Output:
    Hi
Ex:
  Input:
    apple
    ​
  Output:
    apple
Ex:
  Input:
    apple

  Output:
    apple
Ex:
  Input:
    xUxL
    ​
  Output:
    UxL
copied!
Ex:
  Input:
    xUxL

  Output:
    UxL
Ex:
  Input:
    JavaX
    ​
  Output:
    Java
 */