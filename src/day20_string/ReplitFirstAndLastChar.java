package day20_string;

import java.util.Scanner;

public class ReplitFirstAndLastChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println("" + word.charAt(0)+word.charAt(word.length()-1));
    }
}
/*
Use String methods to find the first and last character of the given word. The value of the word will be input from a Scanner, but you only need to interact with the String variable. Output in the following format:
first letter: $first character of the word

last letter: $last character of the word

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

Ex:
  Input:
    adobe
    ​
  Output:
    ae
Ex:
  Input:
    adobe

  Output:
    ae
Ex:
  Input:
    Java
    ​
  Output:
    Ja
 */