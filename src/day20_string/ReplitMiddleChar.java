package day20_string;

import java.util.Scanner;

public class ReplitMiddleChar {

        public static void main(String[] args) {
            //DO NOT TOUCH FOLLOWING LINE/LINES
            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            int length = word.length();

            //WRITE YOUR CODE BELOW
            if(length%2==1){
                System.out.println(word.charAt(length/2));
            }else{
                System.out.println("" + word.charAt(length/2-1)+word.charAt(length/2));
            }

        }
    }

