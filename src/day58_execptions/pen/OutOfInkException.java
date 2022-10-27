package day58_execptions.pen;

public class OutOfInkException extends RuntimeException{
    public OutOfInkException(String message) {
        super(message);
    }
}
