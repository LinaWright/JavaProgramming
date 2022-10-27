package day08_relational_operator;

public class OperatorPractice2 {
    public static void main(String[] args) {

        int a = 40;
        System.out.println(--a); //39 pre decrement, subtract 1 right away, then it prints the valur a, which is 39
        System.out.println(--a); //38 pre decrement, subtract 1 right away, then it prints the valur a, which is 38
        System.out.println(a--); //38 post decrement, first get the current value of a. which is 38 and prints it 38
        System.out.println(--a); //36 pre decrement, current value is 37 subtract 1 right away, then it prints the valur a, which is 36
        System.out.println(--a); //35 pre decrement, current value is 36 subtract 1 right away, then it prints the valur a, which is 35
        System.out.println(a--); //35 post decrement, first get the current value of a. which is 35 and prints it 35, then it subtracts 1


    }
}
