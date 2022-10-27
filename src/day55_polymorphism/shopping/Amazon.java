package day55_polymorphism.shopping;

public final class Amazon extends OnlineShopping{
    @Override
    public void viewCart() {
        System.out.println("View Amazon cart");
    }

    @Override
    public void payForShipping(boolean b) {
        System.out.println(b?"Pay for shipping":"Free Shipping");
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning to Amazon drop location");
    }
}
/*
Create a concrete class Amazon
    - Make the class final
    - Inherit OnlineShopping and implement all abstract methods

 */

// Amazon is a OnlineShopping
// Amazon is a Shopping
// Amazon is a Shipping