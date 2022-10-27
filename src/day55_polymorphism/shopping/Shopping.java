package day55_polymorphism.shopping;

public abstract class Shopping {
    /*
Create an abstract class Shopping
    - Declare two abstract methods:
        buyItem(), returnItem()
 */
    public double price;
    public abstract void buyItem();
    public abstract void returnItem();
}
