package day15_switch;

public class Quiz {
    public static void main(String[] args) {
        int x = 10; // 11
        int y = x++; // 10
        System.out.println(y++ + " " + x++ + " " + y);


        Boolean X = true;
        boolean Y = !X == false;
        boolean Z = Y;
        if (X) {
            System.out.println("Hello");
        }
        if (Y) {
            System.out.println("Bye");
        }
        if (Z) {
            System.out.println("Hello again");
        }
    }
}
