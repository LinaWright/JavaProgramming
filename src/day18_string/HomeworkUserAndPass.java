package day18_string;

import java.util.Scanner;

public class HomeworkUserAndPass {
    public static void main(String[] args) {
        System.out.println("Enter a username");
        Scanner input = new Scanner(System.in);
        String userName = input.next();
        System.out.println("Enter the password");
        String passWord = input.next();

        if(passWord.length()>5) {
            System.out.println("Valid password");
            if(passWord.contains(userName)){
            System.out.println("Invalid password, username should not be in it");
            passWord = "password";
                System.out.println("userName = " + userName);
                System.out.println("passWord = " + passWord);
            }
        }else {
            System.out.println("Password cannot be less than 5 characters");
        }

    }
}
/*
create a class UserAndPass
ask the user to enter a username and password. Check if they are valid based on the following requirements:

- The password cannot be less than 5 characters
	If it is less print: "Password cannot be less than 5 characters"
	If it is more than or equal to 5 print: "Valid password"

- Also, the password should not contain the username
	If the password has the username in it print: "Invalid password, username should not be in it" and in that case change the password to have the
	value: "password"

Print the information in the end
 */
