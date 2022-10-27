package homework_practices;

public class MethodPractice {
    public static void oneTo100(int num){
        for (int i = 1; i <=num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void evenNumbers(int nums){
        for (int i = 1; i <= nums; i++) {
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void isEligibleToVote(int age){
        if(age>=18){
            System.out.println("You are eligible to vote!");
        }else{
            System.out.println("You are not old enough to vote");
        }
    }

    public static void positiveNegativeOrZero(int num){
        if(num>0){
            System.out.println("Positive");
        }else if(num<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        oneTo100(100);
        evenNumbers(100);
        isEligibleToVote(18);
        positiveNegativeOrZero(0);

    }
}
