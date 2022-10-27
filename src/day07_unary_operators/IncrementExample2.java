package day07_unary_operators;

public class IncrementExample2 {
    public static void main(String[] args) {
        int age = 20;
        System.out.println(age); // 20
        System.out.println(age++); //post increment, it's going to run the code first, it's going to print 20 then add value of 1
        System.out.println(age); // 21

        System.out.println(age++); // 21
        System.out.println(age); // 22

        System.out.println(++age); //23 pre increment, before we print it, it'll add value 1 right away

    }
}
