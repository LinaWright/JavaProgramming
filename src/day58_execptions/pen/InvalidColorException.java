package day58_execptions.pen;

public class InvalidColorException extends Exception{
    public InvalidColorException(String message) {
        super(message);
    }
}
