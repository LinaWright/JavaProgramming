package day05_variables;

public class MyName {
    public static void main(String[] args) {
        char firstLetter='l';
        char secondLetter='i';
        char thirdLetter='n';
        char fourthLetter='a';
        System.out.println(firstLetter);
        System.out.println(secondLetter);
        System.out.println(thirdLetter);
        System.out.println(fourthLetter);

        System.out.println("My name is " + firstLetter + secondLetter + thirdLetter + fourthLetter);

        //Or you can make a variable of the name

        String name = "" + firstLetter + secondLetter + thirdLetter + fourthLetter;
        System.out.println(name);

    }
}
