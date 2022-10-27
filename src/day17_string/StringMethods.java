package day17_string;

public class StringMethods {
    public static void main(String[] args) {
        String name = "james";
        //how to compare String values -->use .equals()
        System.out.println(name.equals("james")); //true
        System.out.println("cat".equals("dog")); //false
        System.out.println(name.equals("James")); // false Case sensitive
        System.out.println(name.equalsIgnoreCase("James")); //true

        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a.equals(b)); //true

        System.out.println(a.equals("hello")); // true compares an object with literal "hello" object

        System.out.println(name.length()); // How many characters are in the String

        String last = "Today was fun";
        System.out.println(last.length());
        System.out.println(last.equals("today"));//false
        System.out.println(last.equalsIgnoreCase("TODAY WAS FUN")); //true
    }
}
