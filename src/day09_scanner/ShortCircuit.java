package day09_scanner;

public class ShortCircuit{
public static void main(String[]args){
//Print out 5/0
    System.out.println(true||5/0==00);
//System.out.println(true|5/0==00); error
int a=0;
    System.out.println(false && a++ ==5); //a++is not executed
    System.out.println(a);

    int b=0;
    System.out.println(false & b++ ==5); //b++ is executed
    System.out.println(b);
        }
}
