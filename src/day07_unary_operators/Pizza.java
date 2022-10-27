package day07_unary_operators;

public class Pizza {

    //    create a class Pizza
//add a main method
//        declare and assign these variables:
//
//    type of pizza,  the number of slices,  the number of people eating
//
//    calculate how many slices each person will get
//    calculate how many slices are left over
//
//    Sample print statement:
//
//    We ordered cheese pizza with 8 slices, 4 people ate 2 slices each with 0 left over

    public static void main(String[] args) {
        String typeOfPizza ="sausage and onion";
        int theNumberOfSlices = 10;
        int theNumberOfPeople = 3;
        int howManySlicesEachPersonWillGet = theNumberOfSlices / theNumberOfPeople;

        System.out.println(howManySlicesEachPersonWillGet);

        int howManyLeftover = theNumberOfSlices % theNumberOfPeople;
        System.out.println(howManyLeftover);

        String report = "We ordered " + typeOfPizza + " pizza with " + theNumberOfSlices + " slices, " + theNumberOfPeople + " people ate "
                + howManySlicesEachPersonWillGet + " slices each with " + howManyLeftover + " leftover.";


        System.out.println(report);
    }

}
