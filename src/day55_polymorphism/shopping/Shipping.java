package day55_polymorphism.shopping;

public interface Shipping {
    String country = "US";
    void payForShipping(boolean b);
}
/*
Create an interface Shipping
    - Declare an abstract methods:
        payForShipping(boolean)
 */