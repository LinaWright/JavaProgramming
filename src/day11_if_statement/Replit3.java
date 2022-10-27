package day11_if_statement;

import java.util.Scanner;

public class Replit3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName, lastName, email, street, state, city;
        int age, zipCode;
        double height, weight;
        boolean isMarried;
        long workPhoneNumber ,personalPhoneNumber;
        System.out.println("Welcome to the patient portal!\nPlease enter your personal information");
        System.out.println("Enter your first name");
        firstName = scan.nextLine();
        System.out.println("Enter your last name");
        lastName = scan.nextLine();
        System.out.println("Enter your email");
        email = scan.nextLine();
        System.out.println("Enter your street");
        street = scan.nextLine();
        System.out.println("Enter your city");
        city = scan.nextLine();
        System.out.println("Enter your state");
        state = scan.nextLine();
        System.out.println("Enter your zip code");
        zipCode = scan.nextInt();
        System.out.println("Enter your work phone number");
        workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        age = scan.nextInt();
        System.out.println("Enter your height");
        height = scan.nextDouble();
        System.out.println("Enter your weight");
        weight = scan.nextDouble();
        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();
        System.out.println("Patient personal information");
        System.out.println("Full name: " + firstName +" "+ lastName);
        System.out.println("Address: " + street + ", " + city  + ", " + state + " " + zipCode);
        System.out.println("Contacts: work phone number - " + workPhoneNumber + ", personal phone number - " + personalPhoneNumber + ", email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight + " pounds");
        System.out.println("Married?: " + isMarried);




    }



//    Take all the inputs from the above flow and combine these sections together
//    Declare and assign a contact variable using these inputs: work phone, personal phone and email. Use a comma and a space to separate each value
//
//    Declare and assign a fullName variable using these inputs: first name and last name Use a space to seperate each value
//
//    Declare and assign an address variable using these inputs: street, city, state, zip code Use a comma and a space to separate each value
//
//    Display all of the information together as below
//    The final output of your program should be:
//    The first part of the outcome are the questions which are asked from the Scanner portion
//
//    Welcome to the patient portal!
//    Please enter your personal information
//    Enter your first name
//    Enter your last name
//    Enter your email
//    Enter your street
//    Enter your city
//    Enter your state
//    Enter your zip code
//    Enter your work phone number
//    Enter your personal phone number
//    Enter your age
//    Enter your height
//    Enter your weight
//    Are you married?
//            ​
//    Patient personal information
//    Full name: James May
//    Address: 7925 Jones Branch Dr, McLean, VA 22102
//    Contact: work phone number: 7896542314, personal phone number: 2406542314, email: jamesmay@gmail.com
//    Age: 35
//    Height: 5.1
//    Weight: 173.2 pounds
//    Married: true


}

