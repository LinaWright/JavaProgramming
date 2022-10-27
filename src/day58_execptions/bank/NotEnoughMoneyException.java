package day58_execptions.bank;

public class NotEnoughMoneyException extends RuntimeException {
    //this is an unchecked exception because the parent is the RuntimeException class
    public NotEnoughMoneyException() {
        super("Not Enough money in the account");
    }

    public NotEnoughMoneyException(String msg){
        super(msg);
    }
}
