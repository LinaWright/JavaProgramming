package day23_loops;

import java.util.Scanner;

public class HomeWorkCharactersInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the info");
        String info = input.nextLine();

        for (int i = 0; i < info.length(); i++) {
            int asciiValue = info.charAt(i);
            System.out.print(asciiValue + " ");
        }
    }
}
/*Saim's code
 Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine().trim();
        int spaces = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){ //str.substring(i , i + 1).equals(" ")
                spaces++;
            }
        }

        System.out.println("Number of words: " + (spaces + 1));
Characters in String
Given a String print the ascii value codes for each character
Ex:
Input:
“java”
Output:
106 97 118 97
 */
