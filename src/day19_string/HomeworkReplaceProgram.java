package day19_string;

import java.util.Scanner;

public class HomeworkReplaceProgram {
    /*
    Will do this later when we learn replace method
Given a String message with some text and a number (1-3) replace certain characters from the
String message.
When the number is:
        1: replace 'a' with 'e'
        2: replace 's' with 'r'
        3: replace 'o' with 'z'

    Ex:
        message: java class is fun
        number: 1
        Output: jeve cless is fun

    Ex:
        message: java class is fun
        number: 2
        Output: java clarr ir fun
     */
    public static void main(String[] args) {
        System.out.println("Message: ");
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();
        System.out.println("Number: ");
        int number = input.nextInt();
        switch(number){
            case 1:
                message = message.replace('a' ,'e');
                break;
            case 2:
                message = message.replace('s' ,'r');
                break;
            case 3:
                message = message.replace('o' ,'z');
                break;
        }
        System.out.println(message);
    }

}
