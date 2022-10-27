package day43_custome_classes;

public class Address {
    String street;
    String city;
    String state;
    String zipcode;
    /*
    public Address(String inputStreet, String inputCity, String inputState, String inputZipcode){
        street = inputStreet;
        city = inputCity;
        state = inputState;
        zipcode = inputZipcode;
    }
     */
    public Address(String Street, String City, String State, String Zipcode){
        this.street = Street; //assigning the value of the local street from the parameters to the instance variable street
        this.city = City;
        this.state = State;
        this.zipcode = Zipcode;

    }
}
