package day50_inheritance.book;

public class Library {
    public static void main(String[] args) {
        //not doing anything inheritance here, just a main method to creat my objects
        Book obj1 = new Book();
        //obj1 will have access to 6 instance variables
        AudioBook obj2 = new AudioBook();
        //obj2 will have access to 6 variables from the Book and the 2 new variables in the AudioBook class;
        obj2.duration = 100;
        obj2.narrator = "Someone cool";
        //obj2 has access to the instance method listen()
        obj2.title = "Java is fun";
        obj2.listen();

        Ebook obj3 = new Ebook();
        //obj3 will have access to 6 variables from the Book and the 2 new variables in the Ebook class;
        obj3.size = 20.4;
        obj3.pages = 1004;
        // obj3 has access to the instance method read()
        obj3.title = "Soft skills is important";
        obj3.read();

        // using the updated Author information

        Book obj4 = new Book();
        obj4.author = new Author("JK Rowling", 40); // made an Author object it belongs to the Book obj4 object
        System.out.println(obj4.author);
        System.out.println(obj4.author.getName());

        //Author author = new Author(); Here you are making an Author object in the main method, it is local to the main method

        //but line27 the object is made with the reference coming from the book abject. The Author abject belongs to the Book object
    }
}
