package day12_if_statements;

public class HomeWork4Retake {
//    create a class Retake
//
//declare and assign a grade variable
//        declare and assign an attempt number
//
//        Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:
//
//    If its the first attempt -> subtract 10%
//    If its the second attempt -> subtract 20%
//    If its the third attempt -> subtract 35%
//
//    Based on the retake attempt number calculate the final grade
public static void main(String[] args) {
    int attempt = 2;
    double grade = 89;
    if(attempt == 1){
        System.out.println(grade*0.9);
    }else if(attempt == 2){
        System.out.println(grade*0.8);
    }else if(attempt == 3){
        System.out.println(grade*0.65);
    }
    System.out.println("Your final grade is: " + grade);
}
}
