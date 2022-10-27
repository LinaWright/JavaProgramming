package day42_customer_classes;

public class animal {
    String species;
    long population;

    public String toString(){
        String print = " Species: " + species;
        print +="\nPopulation: " + population;
        return  print;
    }
}
