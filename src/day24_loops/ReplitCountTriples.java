package day24_loops;

import java.util.Scanner;

public class ReplitCountTriples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count =0;
        for (int i = 0; i < str.length()-3; i++) {
            if((""+str.charAt(i)).equals(""+str.charAt(i+1))&&(""+str.charAt(i+1)).equals ("" + str.charAt(i+2))){
                count++;
            }
        }
        if ((""+str.charAt(str.length()-3)).equals((""+str.charAt(str.length()-2)))&&(""+str.charAt(str.length()-2)).equals((""+str.charAt(str.length()-1)))){
            count++;
        }
        System.out.println(count);
    }
}
/*
Use a loop to count the number of triples in the given str. A triple is when the same character appears three times in a row. So if there is a
specific character that is repeated three times, that will be counted as one triple. Print the total number of triples found in the String. The
triples may overlap.
Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

Ex:
  Input:
    abcXXXabc

  Output:
    1

Ex:
  Input:
    xxxabyyyycd

  Output:
    3

  -> the triples found are xxx yyy and another yyy
Ex:
  Input:
    java
    ​
  Output:
    0
 */