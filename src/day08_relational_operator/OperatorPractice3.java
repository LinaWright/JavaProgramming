package day08_relational_operator;

public class OperatorPractice3 {

    public static void main(String[] args) {
        int h = 5; // h= 5
        int p = h; //p gets assigned the value of h, which is 5, p = 5

        h++; //post increment, no other code so it adds 1

        System.out.println("h " + h);
        System.out.println("p " + p);

        int k = h++; // post increment, get the value first, which is 6 and assign it to the new variable k, so k has the value of 6, then h adds 1

        System.out.println("h " + h);
        System.out.println("k" + k);

        int g = ++h; // pre increment, increment 1 right away. then it assigns the value from h to the new variable g
        System.out.println("g " +g);
        System.out.println("h" + h);
    }
}
