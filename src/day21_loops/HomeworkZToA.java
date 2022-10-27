package day21_loops;

public class HomeworkZToA {
    //    write a program that will print all the alphabet letters backwards in uppercase from 'Z' to 'A'
    public static void main(String[] args) {
        int num = 90;

        while (num >= 65 && num <= 90) {

            char letter = (char) num;
            System.out.println(letter);
            num--;
        }
//        write a program that will print all the alphabet letters backwards in lowercase from 'z' to 'a'
//      a-->z  97-->122
        System.out.println();
        int num2 = 122;

        while (num2 >= 97 && num2 <= 122) {

            char letter2 = (char) num2;
            System.out.println(letter2);
            num2--;

        }
    }
}
