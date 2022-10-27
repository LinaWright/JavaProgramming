package day08_relational_operator;
public class UpdateVariables {

public static void main(String[]args){

    //adding 1 to a variable
    int a = 10;
    a = 11;
    a++;
    ++a;
    a = a + 1;

    //add 10 to the variable

    int b = 4;
    //10 times b++;
    b = 14;
    b = b + 10; // reads the value of 10, add 10 to it, the result is store back into b ny reassigning
    b += 10; // this code is same as b = b+10

    int count = 0;
    count +=5; //count = count + 5;
    System.out.println(count);
    count -= 10; //count = count - 10;
    count *= 2;
    System.out.println(count);
        }

}
