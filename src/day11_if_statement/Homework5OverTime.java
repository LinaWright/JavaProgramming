package day11_if_statement;

import java.util.Scanner;

public class Homework5OverTime {
//    create a double variable for your hourly rate
//    create a double variable for the number of hours worked
//    calculate your net pay, with consideration of overtime pay
//if you worked more than 40 hours you get overtime pay for the hours
//    past 40. Overtime pay is 1.5 the normal rate
//            (if you worked 43 hours, you will get 40 hours normal pay
//                    and 3 hours overtime pay)
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your hourly rate");
    double hourlyRate = input.nextDouble();
    System.out.println("please enter hours you worked");
    double hoursWorked = input.nextDouble();

    if(hoursWorked<=40){
        System.out.println(hourlyRate*hoursWorked);
    }
    if(hoursWorked>40){
        System.out.println((hoursWorked-40)*hourlyRate*1.5 +40*hourlyRate);
    }

}
}//Saim's code
//    double hourlyRate = 20.5;
//    double numberOfHours = 44;
//    double netPay;
//    String message;
//
//        if(numberOfHours > 40) {
//
//                // when the number of hours is more than 40, we will get an extra 1.5 for overtime pay
//
//                double overtimeHours = numberOfHours - 40;
//                netPay = 40 * hourlyRate;
//                netPay += overtimeHours * hourlyRate * 1.5; // netPay = netPay + overtimeHours * hourlyRate * 1.5;
//                message = "You worked " + numberOfHours + " hours at a rate of " + hourlyRate + ", but " + overtimeHours + " of the hours were overtime, so you got an additional pay for those hours. Your net pay was $" + netPay;
//
//                } else {
//                // when the number of hours is less than or equal to 40, we will run this code
//                netPay = numberOfHours * hourlyRate;
//                message = "You worked " + numberOfHours + " hours at a rate of " + hourlyRate + " there was no overtime. Your net pay was: $" + netPay;
//                }
//
//                System.out.println(message);