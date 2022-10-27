package day19_string;

import java.util.Scanner;

public class HomeworkMiddleChar {
    /*
    [Middle char]
Given a String, write a program to display the middle character of a string
a) If the length of the string is even there will be two middle characters. b) If the length of the
string is odd there will be one middle character.
Ex:
Input: elephant  lina
       01234567  0123
Output: The middle characters: ph
     */
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        if(str.length()%2==0){//even
            System.out.println("" + str.charAt(str.length()/2-1) +  str.charAt(str.length()/2));
        }
        if(str.length()%2==1){//odd

            System.out.println(str.charAt((str.length()-1)/2));
        }
    }
}
/* Saim's code
String s = "abcdef";
                //  012345

        int mid = s.length() / 2;

        if(s.length() % 2 == 0){
            // our word is even length
            // length / 2 => 6 / 2 = 3

            char firstMiddle = s.charAt(mid - 1);
            char secondMiddle = s.charAt(mid);
            System.out.println("With charAt: " + firstMiddle + secondMiddle);
            System.out.println("With substring: " + s.substring(mid - 1, mid + 1 ));

        } else {
            // our word is odd length

            char middle = s.charAt(mid);
            System.out.println("With charAt: " + middle);
            System.out.println("With substring: " + s.substring(mid, mid + 1));

        }
 */