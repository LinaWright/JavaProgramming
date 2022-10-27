package day06_arithmetic_operators;

public class House {
    public static void main(String[] args) {


//    Create a class House
//    Create a main method
//
//    - Each the datatype you feel is most appropriate for each variable.
//
//            - Create the following variables:
//    house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),
//
//    - Print each variable with a message with the value
//    Ex: The number of bedrooms is: 4
//    The number of bathrooms is: 3

    String houseType = "Penthouse";
    int numberOfBedrooms = 4;
    int numberOfBathrooms = 3;
    int numberOfKitchens = 2;
    boolean isThereAPool = true;
    boolean hasAttic = false;
    boolean hasBasement = false;
    boolean isOnSale = false;
    double costOfHouse = 1_000_000.99;
    String address = "123456 Central Park";
    int zipcode = 12345;
    boolean hasPark = true;
    double schoolRating = 4.6;

    String houseInfo = "the " + houseType + " on " + address + ", " + zipcode + " costs $" + costOfHouse + "\nThe " +
            houseType + " has " +numberOfBedrooms + "bedrooms, " + numberOfBathrooms + " bathrooms, " + numberOfKitchens + "kitchens\nIt also includes a basement: "
            + hasBasement + ", has an attic: " + hasAttic;

        System.out.println(houseInfo);
    }
}

