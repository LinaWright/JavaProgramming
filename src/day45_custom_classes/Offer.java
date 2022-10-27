package day45_custom_classes;

public class Offer {
    /*
        create a class called Offer

        - data:

            location, company, salary, is full time, number of PTO
    */

    String company;
    String location;
    double salary;
    boolean isFullTime;
    int numberOfPTO;

    /*
        - constructor

            - create a constructor that creates an Offer object with the company and location

            - create a constructor that creates an Offer object with the company, location, and salary

            - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO

    */

    public Offer(String location, String company) {
        this.company = company;
        this.location = location;
    }

    public Offer(String company, String location, double salary) {
        this.company = company;
        this.location = location;
        this.salary = salary;
    }

    public Offer(String company, String location, double salary, boolean isFullTime, int numberOfPTO) {
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }

    /*
        - method:

            toString()
                print all the employees information

    Create a separate class to create and test the Offer objects
     */

    @Override
    public String toString() {
        String info = "\n" + company + " is located in " + location;
        info += " ~ " + (salary > 0 ? salary : "");
        info += " ~ " + (isFullTime ? "Full time" : "Contract");
        info += " ~ " + (numberOfPTO > 0 ? numberOfPTO : "");

        return info;
    }
}

