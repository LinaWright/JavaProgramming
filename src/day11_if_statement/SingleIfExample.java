package day11_if_statement;

public class SingleIfExample {
    public static void main(String[] args) {
//        if(false){
//            System.out.println("Hello world"); //If statement is false so it does not print
//        }
//        System.out.println("Second line"); //just normal print statement, nothing to do with if statements
//        if(true){
//            System.out.println("Today is monday");} // the if statement is true, so it'll print

        int score = 60;
        if (score > 75){
            System.out.println("passing");
        }
        if (score < 75){
            System.out.println("Failing");
        }

        int year = 2021;
        boolean lockdown = year ==2020 || year ==2021;
        if(lockdown){
            System.out.println("Stay at home");
            System.out.println("Practice java");
            System.out.println("wear a mask");
        }
        if(!lockdown){ //!false -> true
            System.out.println("Party");
            System.out.println("Still practice java");
            System.out.println("travel");;
        }
//in the situation where the lockdown valur is true | !true -> false

    }
}
