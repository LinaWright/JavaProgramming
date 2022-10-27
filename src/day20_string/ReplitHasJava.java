package day20_string;

import java.util.Scanner;

public class ReplitHasJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if(word.contains("java")){
            if(word.indexOf("java")==0){
                System.out.println("true");
            }
            else if(word.indexOf("java")==1){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }else{
            System.out.println("false");
        }
    }
}
/*
Use String methods to check if the given word contains the text java, but not anywhere in the String. The java text must be in either position 0 or
 position 1 of the String. If the text java appears in any other position it is not valid and is not considered to be found in the String. Output a
  boolean value, true or false.
Note: You won't be able to just use contains method
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

Ex:
  Input:
    javapython
    ​
  Output:
    true
Ex:
  Input:
    javapython

  Output:
    true
Ex:
  Input:
    cjavac++
    ​
  Output:
    true
Ex:
  Input:
    cjavac++

  Output:
    true
Ex:
  Input:
    c#javaruby
    ​
  Output:
    false
    ​
  -> The 'java' is not in positions 0 or 1
 */