package day11_if_statement;

import java.util.Scanner;

public class Homework3 {
    //    create a sales amount variable
//    use the sales amount to determine the bonus you get at end of the month
//
//	if your sales amount is less than 10000 you don't get any bonus
//
//            if your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000
//
//            if your sales amount is more than or equal to 15000 you get a bonus of 7000
//
//    print your bonus number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sales amount");
        double saleAmount = input.nextDouble();

        if (saleAmount < 10000) {
            System.out.println("No bonus");
        }
        if ((saleAmount >= 10000) && (saleAmount < 15000)) {

            System.out.println("5000 bonus");
        }
        if (saleAmount >= 15000)
        {
            System.out.println("7000 bonus");
        }
    }
}
