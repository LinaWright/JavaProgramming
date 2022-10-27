package day33_methods;

import java.util.zip.ZipEntry;

public class GetCharacters {
    /*

        make a method that prints all the letters from A - Z

        make a method that prints all the letters from a - z

        make a method that prints all the letters from Z - A

        make a method that prints all the letters from z - a

        make a method that prints all the numbers from 0 - 9

     */
    public static void AToZ(){

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void aToz(){

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void ZToA(){

        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void zToa(){

        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void num0To9(){

        for (char i = '0'; i <= '9'; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AToZ();
        aToz();
        ZToA();
        zToa();
        num0To9();
    }
}
