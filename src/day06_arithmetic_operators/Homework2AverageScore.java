package day06_arithmetic_operators;

public class Homework2AverageScore {
    public static void main(String[] args) {
//        create a class AverageScore
//add a main method
//        declare and assign these variables:
//        four score values
//
//        calcualte the average score using the given four score values
//
//        Ex:
//        90, 80, 100, 95
//
//        Print:
//        Average: 91.25

        int score1 = 90;
        int score2 = 89;
        int score3 = 100;
        int score4 = 95;
        int total = score1 + score2 + score3 + score4;
        System.out.println(total);

        //double average = total/4;
        // why do I have cast here to get the correct number? isn't it automatic? why do I lose value if I didn't cast?

       // Integer divided by another integer gives you an integer, so what you can do without casting it is:
        // double average = total/4.0 this will give you the correct output

        double average = total/4.0;

        System.out.println(average);

    }
}
