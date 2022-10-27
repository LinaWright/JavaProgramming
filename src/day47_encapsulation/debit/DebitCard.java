package day47_encapsulation.debit;

public class DebitCard {
     /*
    Debit card - custom classes + static

    Create a class for Debit Card that has the following instance variables:
        card number (long), holder name (String), card type (String), pin (int), and balance (double)

        static variables: account type (debit)
            -> Use static block to initialize account type
     */

    //instance variable
    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;

    //static variable
    static String accountType;

    static {
        accountType = "Checking";
    }
    /*

    Create a constructor that will create a debit card object and initialize the card number, the card holder name, and the balance. The card number has to be 16 characters long to be a valid card number. If the length is too short or too big do not store the card number and print “Invalid card number”

    Overload the constructor to take all of the instance variables. The card type must be either MasterCard or Visa to be valid card type. If it is not one of those two then do not store the type and print “invalid card type”. Also the pin must be only 4 characters long. If the pin is more than or less than 4 characters then do not store the pin into the instance variable and print “Invalid pin length”

    */

    public  DebitCard(long cardNumber, String holderName, double balance){
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.balance = balance;

        if(String.valueOf(cardNumber).length() == 16){ //("" + cardName).length()
            this.cardNumber = cardNumber;
        }else{
            System.err.println("Invalid card number"); //err makes the output red
        }
    }

    //this() is used to chain the constructors
    public DebitCard(long cardNumber, String holderName, String cardType, int pin, double balance) {
        this(cardNumber,holderName,balance);
        if(cardType.equalsIgnoreCase("visa")||cardType.equalsIgnoreCase("mastercard")) {
            this.cardType = cardType;
        }else {
            System.out.println("Invalid Card Type - Must be Visa or Mastercard");
        }
        if(String.valueOf(pin).length() ==4){//valueOf coverts int type to String type, so that we can use String method to check the length
            this.pin = pin;
        }else{
            System.out.println("Invalid Pin - Must be 4 digits");
        }

    }

    //this is the reference of the DebitCard objects

    /*

    Add the toString method that will print all of the cards information (Except the pin). If the card type does not have a value do not print that line.

     */
    public String toString(){
        String info = "Holder Name " + holderName;
        if(cardNumber!=0){
            info += "\n Card number: " + cardNumber;
        }
        if(cardType != null){
            info += "\n Card type: " + cardType;
        }
        info +="\nBalance: " + balance;
        return info;
    }
}
