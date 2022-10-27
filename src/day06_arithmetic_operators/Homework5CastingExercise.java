package day06_arithmetic_operators;

public class Homework5CastingExercise {
//    declare and assign a short variable
//    declare and assign a byte variable with the short value above. Cast if needed
//
//    declare and assign a float variable
//    declare and assign a double variable with the float value above. Cast if needed
//
//    declare and assign a double variable
//    declare and assign a int variable with the double value above. Cast if needed
//
//    declare and assign a long variable
//    declare and assign a int variable with the long value above. Cast if needed

    public static void main(String[] args) {
    short a = 100;
    byte b = (byte)a; //smaller

    float c = 3.14F;
    double d = c;

    double f = 6.9;
    int g = (int)f; //smaller

    long h = 80;
    int i = (int)h; //smaller

        //bigger sata type to smaller type needs to cast,
        //smaller date type to bigger type no need to cast.(automatic)


    }
}
