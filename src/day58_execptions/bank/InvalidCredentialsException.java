package day58_execptions.bank;

public class InvalidCredentialsException extends Exception{
    //this is a checked exception because the parent is the Exception class
    public InvalidCredentialsException(String msg){
        super(msg);
    }

}
