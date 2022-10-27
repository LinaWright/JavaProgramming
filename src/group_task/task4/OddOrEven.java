package group_task.task4;

public class OddOrEven {
     /*
 Numbers - odd & even
Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
     */
     public static void oddOrEven (int num){
         if(num%2==0){
             System.out.println("The number is even");
         }else{
             System.out.println("The number is odd");
         }
     }

    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(16);
    }
}
