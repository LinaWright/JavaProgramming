package day08_relational_operator;

public class OperatorPractice {
    public static void main(String[] args) {
        int b = 10;
        b++; // post increment, no other code adds 1
        System.out.println(b); //print the value of b, which is 11
        b--; //post decrement, no other code. subtract 1
        System.out.println(b); //print the value of b, which is 10
        System.out.println(b++); // post increment, we get the value first, which is 10 and print it
        System.out.println(b++); //post increment, we get the value first which is 11, print it, then add 1
        System.out.println(b); // 12
    }

}
