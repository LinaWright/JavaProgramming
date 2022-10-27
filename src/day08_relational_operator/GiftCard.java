package day08_relational_operator;

public class GiftCard {
    //Task declare and assign a gift card with 200 buy 2 items, buy item 1 for x price and subtract from the gift card
    //buy item 2 for x price and subtract from the gift card
    //print the remaining balancer of the gift card

    public static void main(String[] args) {
        double giftCard = 200.00;
        System.out.println("Buy item for 100$");
        giftCard -= 100; //giftCard = giftCard - 100;

        System.out.println("Buy item 2 for 40$");
        giftCard -= 40;
        System.out.println("Your gift card balance is now " + giftCard);

    }


}
