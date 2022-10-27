package day08_relational_operator;

public class SignType {
    /*
         Task:
            Declare and assign a number

            I want to know the sign of the number
                if the number positive
                is the number negative
                is the number 0
     */
    public static void main(String[] args) {
        int number = 20;
        boolean isTheNumberPositive = number > 0;
        boolean isTheNumberNegative = number < 0;
        boolean isTheNumber0 = number == 0;

        System.out.println("if the number negative: " + isTheNumberNegative);
        System.out.println("if the number positive: " + isTheNumberPositive);
        System.out.println("is the number 0: " + isTheNumber0);


    }



}
