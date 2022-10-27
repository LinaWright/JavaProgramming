package day50_inheritance.book;

public class Ebook extends Book{
    /*
    Create a class EBook

    - EBook class inherits Book class

    - create additional variables:
    size, pages

    - create method:
    read()
    Example output: prints Reading a digital copy of $title

    Create objects of all three to see which variables and methods each object has access to
    */
    double size;
    int pages;

    public void read(){
        System.out.println("Reading a digital copy of " + title);
    }
}
