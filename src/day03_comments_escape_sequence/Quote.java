package day03_comments_escape_sequence;

public class Quote{
    public static void main(String[] args) {
        /*Q: How can you output put this?
        I like "Java" programming
        */
        System.out.println("I like \"Java\" programming");
        System.out.println("\"This is a quote\"");
        /*
        The first quote is before java printing the text
        The second quote is to print the " quotation mark in the console
         */
    //I want to print backslash
        System.out.println("abc\\def"); //This will print one backslash
        System.out.println("abc\\\\def");//this will print two backslash

    }


}
