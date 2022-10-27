package Day14_if_statements;

import java.util.Scanner;

public class HomeWork3Movie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the movie length: ");
        double movieLength = input.nextDouble();
        double price = 0;
        if (movieLength >= 1.0 && movieLength < 1.5) {
            price = 8.99;
        } else if (movieLength >= 1.5 && movieLength < 2.0) {
            price = 10.50;
        } else if (movieLength >= 2.0 && movieLength < 2.5) {
            price = 14.50;
        } else if (movieLength == 3.0 || movieLength == 3.5 || movieLength == 4.0) {
            price = 15.99;
        } else {
            if (movieLength <= 0) {
                System.out.println("Movies cannot be less than 0 minutes");
            } else if (movieLength > 4) {
                System.out.println("Movies cannot be more than 4 hours");
            }
        }
        if (movieLength > 0 && movieLength <= 4) {
            System.out.println("Price for the movie: " + price);
        }

    /*
    The length of the movie will determine how much it costs.
declare and assign a variable for the duration of the movie
The length will be given as a decimal as hours.minutes

	duration of less than or equal to 0:
		Movies cannot be less than 0 minutes
	duration of more than 4:
		Movies cannot be more than 4 hours

	for all other duration uses the following values to display the price of the tickets

		duration 	--> price
		1.0 		--> 8.99
		1.5 		--> 10.50
		2.0 		--> 12.99
		2.5 		--> 14.50
		3, 3.5 or 4 --> 15.99
     */
    }
}
