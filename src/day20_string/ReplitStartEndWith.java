package day20_string;

import java.util.Scanner;

public class ReplitStartEndWith {
    public static void main(String[] args) {
        /*
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = s.next();
        System.out.println("start with: ");
        String a = s.next();
        System.out.println("ends with: ");
        String b =s.next();

        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length()-1);


        if(a.equals(""+firstLetter)){
            System.out.println("Start with " + a + ": true");
        }else{
            System.out.println("Start with " + a + ": false");
        }
        if(b.equals(""+lastLetter)){
            System.out.println("Ends with " + b + ": true");
        }else{
            System.out.println("Ends with " + b + ": false");
        }
    }
}
    /*
    Use String methods to check if the given word starts with the letter a and ends with the letter e. Print two boolean values to represent each:
Starts with a: $boolean

Ends with e: $boolean

Main topics: String manipulation, Scanner, methods, primitive datatypes

Ex:
  Input:
    apple
    ​
  Output:
    Starts with a: true
    Ends with e: true
Ex:
  Input:
    apple

  Output:
    Starts with a: true
    Ends with e: true
Ex:
  Input:
    air
    ​
  Output:
    Starts with a: true
    Ends with e: false
copied!
Ex:
  Input:
    air

  Output:
    Starts with a: true
    Ends with e: false
Ex:
  Input:
    light
    ​
  Output:
    Starts with a: false
    Ends with e: false
     */
        Scanner s = new Scanner(System.in);

        String word = s.next();

        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length()-1);

        if(firstLetter=='a'){
            System.out.println("Starts with a: true");
        }else{
            System.out.println("Starts with a: false");
        }
        if(lastLetter=='e'){
            System.out.println("Ends with e: true");
        }else{
            System.out.println("Ends with e: false");
        }
    }
}