package homework_practices;

import java.util.Scanner;

public class CurrencyConverter {
    public static double num(String currencyType) {

        Scanner input = new Scanner(System.in);
        double dollar = input.nextDouble();

        switch (currencyType) {
            case "euro":
                return 0.91 * dollar;
            case "yen":
                return 121.03 * dollar;
            case "lira":
                return 14.85 * dollar;
            case "won":
                return 1217.52 * dollar;
            case "rupee":
                return 181.45 * dollar;
        }

        return num(input.nextLine());

    }

    public static void main(String[] args) {
        System.out.println(num("euro"));

    }

}

    /* saim's code
      public static double convert(String type, double amount){

        switch (type.toLowerCase()){
            case "euro":
                return amount * 0.91;
            case "yen":
                return amount * 121.03;
            case "lira":
                return amount * 12.85;
            case "won":
                return amount * 1_217.52;
            case "rupee":
                return amount * 181.45;
            default:
                return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println(convert("euro", 100)); // convert(next(), nextDouble())
    }

    Currency Converter
    create a method that will accept a currency type(String) and a currency
    amount (double)[as dollars] and convert the currency from dollars to a
    different type
    Use the following information to convert from given dollars to the desired
    currency type
    1 dollar = 0.91 euro
    1 dollar = 121.03 yen
    1 dollar = 14.85 lira
    1 dollar = 1,217.52 won
    1 dollar = 181.45 rupee
    Note: Don't worry about decimal formats, focus on method
    Ex:
    Input:
    euro, 100
    Output:
    91
    Ex:
    Input:
    yen, 50
    Output:
    6051.5
     */