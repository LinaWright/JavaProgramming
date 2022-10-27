package day05_variables;

public class RecapVariables {
    public static void main(String[] args)

    {
//        Declare variable
        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalStudentInClass;

        //We can't print the variables because they don't have a value
//        System.out.println(numberOfCoffeeCups);
//        System.out.println(totalPriceOfCoffee);
//        System.out.println(totalStudentInClass);
        //Assigning to variable

        numberOfCoffeeCups = 2;
        totalPriceOfCoffee = 10.25;
        totalStudentInClass = 22;

                System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalStudentInClass);
        System.out.println(numberOfCoffeeCups + "*" + totalStudentInClass); //we use concatenation to print the values of two variables at the same time
        //Declare and assign

        double temperature = 20.6;
        int javaDays = 5;

        System.out.println("\nIt is day " +javaDays + "in Java class");
        System.out.println("This is my temperature " +temperature);

    }
}
