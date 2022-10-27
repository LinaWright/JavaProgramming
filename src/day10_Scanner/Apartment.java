package day10_Scanner;

import java.util.Scanner;

public class Apartment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         /*
        Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers, allows pets or not,
         has a pool, length of lease, total number of residents in building, phone number of owner, is near a gas station, number of floors,
          has a basement, has available units for rent, has air conditioning, number of parking spaces, has wheel chair access, number of review stars
          (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)

     */

        System.out.println("Address");
        String address = input.nextLine();

        input.nextLine();

        System.out.println("Name of the owner");
        String nameOfTheOwner = input.nextLine();

        System.out.println("Number of the unit");
        int numberOfTheUnit = input.nextInt();

        System.out.println("Average size");
        int averageSize = input.nextInt();

        System.out.println("Monthly rent amount,");
        double monthlyRentAmount = input.nextDouble();

        System.out.println("How many washers and driers?");
        int numberOfWashersAndDriers = input.nextInt();

        System.out.println("Allows pets or not?");
        boolean allowsPets = input.nextBoolean();

        System.out.println("Does it have a pool");
        boolean hasAPool = input.nextBoolean();

        System.out.println("How long is the lease?");
        int lengthOfLease = input.nextInt();

        System.out.println("Total number of residents in building?");
        int numberOfResidents = input.nextInt();

        input.nextLine();

        System.out.println("Phone number of owner");
        String phoneNumber = input.nextLine();

        System.out.println("is near a gas station,");
        boolean isNearGasStation = input.nextBoolean();

        System.out.println("Number of floors?");
        int numberOfFloors = input.nextInt();

        System.out.println("Does it have a basement?");
        boolean hasABasement = input.nextBoolean();

        System.out.println("Has available units for rent?");
        boolean hasAvailableUnitsForRent = input.nextBoolean();

        System.out.println("Has air conditioning?");
        boolean hasAirConditioning = input.nextBoolean();

        System.out.println("Number of parking spaces?");
        int numberOfParkingSpaces = input.nextInt();

        System.out.println("Has wheel chair access?");
        boolean hasWheelChairAccess = input.nextBoolean();

        System.out.println("Number of review stars");
        double numberOfReviewStars = input.nextDouble();


        double monthlyRentAfter3Years = monthlyRentAmount * 0.9;
        double monthlyRentAfter6Years = monthlyRentAmount * 0.8;
        int AverageNumberOfResidentsPerUnit = numberOfResidents/numberOfTheUnit;
        int AverageNumberOfParkingSpotsPerUnit = numberOfParkingSpaces/numberOfTheUnit;
        int AverageNumberOfUnitsPerFloor = numberOfTheUnit/numberOfFloors;

    }
}
