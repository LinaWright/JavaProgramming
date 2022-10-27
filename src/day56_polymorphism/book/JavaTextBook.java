package day56_polymorphism.book;

public class JavaTextBook extends EBook{
    boolean fun;

    @Override
    public void read() {
        System.out.println("Reading java textbook");
    }

    @Override
    public void download() {
        System.out.println("Downloading java textbook");
    }

    @Override
    public void open() {
        System.out.println("Opening java text book");
    }
}
