package day20_string;

import java.util.Scanner;

public class ReplitHalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String half = word.substring(0,word.length()/2);
        System.out.println("" + half + half);
    }
}
/*
Use String methods to print the first half of the given word, twice. Find the beginning half of the String and concatenation it twice.
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

Ex:
  Input:
    java
    ​
  Output:
    jaja
Ex:
  Input:
    java

  Output:
    jaja
Ex:
  Input:
    unity
    ​
  Output:
    unun
 */