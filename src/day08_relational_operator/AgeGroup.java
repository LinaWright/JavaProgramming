package day08_relational_operator;

public class AgeGroup {
    public static void main(String[] args) {
        int age = 3;
        boolean isThePersonAKid  = age<=13;
        boolean isThePersonASenior = age>=65;
        System.out.println("You are a kid: " + isThePersonAKid);
        System.out.println("You are a senior: " + isThePersonASenior);
    }

}
