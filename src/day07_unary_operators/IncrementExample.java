package day07_unary_operators;

public class IncrementExample {
    public static void main(String[] args) {
        int x = 0;
        System.out.println(x); // 0

        System.out.println(x+1); //1

//        System.out.println(x); //0 The value didn't change

        x=x+1; //take the value of x, which is 0 then add 1 -> 0+1=1 -> x=1
        System.out.println(x); //1

        x++; // post increment, add 1 to the value (post increment is the one that we are going to use the most)

        System.out.println(x); // 2

        ++x; // pre increment
        System.out.println(x);

        System.out.println(++x);//because it is preincrement it will add 1 right away so 4 is printed;

        System.out.println(x++); //statement is run first because it is a post increment, we will see 4

        System.out.println(x); //5
    }
}
