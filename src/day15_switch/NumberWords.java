package day15_switch;

public class NumberWords {
    /*

    take a number and print the number as the word version
    ex: 1 -> one

     */
    public static void main(String[] args) {

        int n = 5;

        //as if statement

        if (n==1){
            System.out.println("one");
        }else if(n==2){
            System.out.println("two");
        }else if(n==3){
            System.out.println("three");
        }else if(n==4){
            System.out.println("four");
        }else if(n==5){
            System.out.println("five");
        }else{
            System.out.println("Invalid number");
        }

        //as switch statement

        switch (n){
            case 1: // in if statement: if(n==1){
                System.out.println("one");
                break; //stop and exit the execution
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("Invalid number from switch");
                break;
        }
    }
}
