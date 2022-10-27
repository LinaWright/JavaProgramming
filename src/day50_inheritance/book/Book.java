package day50_inheritance.book;

public class Book {
    /*
    Create a Book class

    - create variables:
    title, author, genre, chapter, price, has a movie
    */

    String title;
    Author author;
    String genre;
    int chapters;
    double price;
    boolean hasAMovie;

    /*
    Take a look at the Book class from today
    we originally had String author
    but this was only a String type so it could only have
    characters
    We made a separate Author class, so be able to define the
    information of an Author better
    That allowed us to replace the String author with Author
    -> Author author
    becomes an instance variable, it belongs to
    the objects of the class, which were Book objects
    summary: Give us more information about the author besides
    just a name
     */
}
