package group_task.task1;

public class T03_FINRA {
    public static void FINRA  (int num) {
        if(num%3==0 && num%5==0){
            System.out.println("FINRA");
        }else if(num%3==0){
            System.out.println("FIN");
        }else if(num%5==0){
            System.out.println("RA");
        }else{
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        FINRA(19);
    }
}
/*
3) Numbers - FINRA
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */