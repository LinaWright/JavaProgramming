package day25_Recap;

import java.util.Scanner;

public class HomeworkMultiplyEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String str = input.nextLine();
        System.out.println("Please enter a number: ");
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            str = str + str.charAt(str.length()-1);
        }
        System.out.println(str);
    }
}
/*
Multiply End [String, Loops]

Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times

	Ex:
		Input:
			Hello?
			3
		Output:
			Hello????

	Ex:
		Input:
			java
			5
		Output:
			javaaaaaa
 */