package group_task.task1;

public class T06_PrimeNumber {
public static void isPrime (int num) {
    int count = 0;
    for (int i = 2; i < num; i++) {
        if (num % i == 0) {
            count++;
        }
    }
    if (count == 0) {
        System.out.println("Number is prime");
    } else {

        System.out.println("Number is not prime");
    }
}

    public static void main(String[] args) {
        isPrime(12);
    }
}
/*
6) Numbers - Prime Number
Write a method that can check if a number is prime or not. A prime number is a number that is only divisible by 1 and itself
 */