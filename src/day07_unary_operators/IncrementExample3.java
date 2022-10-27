package day07_unary_operators;

public class IncrementExample3 {
    public static void main(String[] args) {
        int i = 5; //5
        int z = i++; //5 after running the code, i value is increased 1, now the i vale is 6

        System.out.println(i); //6
        System.out.println(z); //5

        int a = 10;
        int b = a + 1;

        System.out.println(a); //10
        System.out.println(b); //11

        int c = ++a; //11

        System.out.println(c); //11
        System.out.println(a); //11



    }
}
