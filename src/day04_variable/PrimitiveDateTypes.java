package day04_variable;

public class PrimitiveDateTypes {
    public static void main(String[] args) {
        byte age = 60; //declared and assigned at the same time
        System.out.println("age");
        System.out.println(age);//Using the variable is easier to change the date, use it multiple times
        //byte age2 =200; This is not going to work because the number is bigger than the (data type)container
//        shortcut to comment: control + /
        short year; //declared a variable called year/ It's short type
        year = 2022; //assigned 2022 into my year variable
        year = 2023; //reassigns the value to be 2023. it changes it
        System.out.println(year);
        int addressNumber = 34916;
        long bigNumber = 153548633916L;//Bt default the compiler use int type, adding L to the number, tells the compiler that this is a long number


    }
}
