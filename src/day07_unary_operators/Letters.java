package day07_unary_operators;

public class Letters {
    public static void main(String[] args) {
        //task: define a character. print the next 4 characters on new lines
        char letter = 'E';
        System.out.println("Original " + letter++);
        System.out.println((int)letter);
        System.out.println("Nest four:" );
        System.out.println(letter++);
        System.out.println((int)letter);
        System.out.println(letter++);
        System.out.println((int)letter);
        System.out.println(letter++);
        System.out.println((int)letter);
        System.out.println(letter++);
        System.out.println((int)letter);

    }
}
