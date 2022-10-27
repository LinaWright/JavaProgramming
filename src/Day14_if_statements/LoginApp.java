package Day14_if_statements;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        int expectedPin = 1552;
        int expectedSSN = 1234;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your pin:");
        int pin = input.nextInt();
        System.out.println("Please enter your SSN:");
        int SSN = input.nextInt();

        boolean correctPin = pin == expectedPin;
        boolean correctSSN = SSN == expectedSSN;

        if(correctPin && correctSSN){
            System.out.println("Authentication successful");
        }else{
            System.out.println("Authentication failed");
            if(!correctPin) {
                System.out.println("incorrect pin code");
            }if(!correctSSN){
                System.out.println("invalid ssn");
            }
        }
    }
}
/*
inputs:
declare and assign a 4 digit pin code
declare and assign the last 4 digits of ssn: 1234

declare and assign expected values for both
    example expected:
        pin: 1552
        ssn: 1234

outputs:

    when the pincode and ssn match the expected print:
        Authentication successful

    when the pincode or ssn are not correct print:
        Authentication failed

    when the pincode was not correct print:
        incorrect pin code

    whent he ssn is not correct print:
        invalid ssn
 */