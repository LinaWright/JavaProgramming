package day42_customer_classes;

public class AllPeople {
    public static void main(String[] args) {
        //System.out.println(Person.name); These are not valid ways to access instance variables
        Person PersonOne = new Person();//creates an object of the Person class
        Person PersonTwo = new Person();

        //Accessing the instance variables
        PersonOne.name = "James";
        PersonOne.age = 40;
        PersonOne.height = 5.10;
        PersonOne.isMarried = false;

        //printing the instance variable
        System.out.println(PersonOne.name);
        System.out.println(PersonOne.age);
        System.out.println(PersonOne.height);
        System.out.println(PersonOne.isMarried);
    }
}
