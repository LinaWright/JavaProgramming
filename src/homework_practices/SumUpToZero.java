package homework_practices;

import java.util.Arrays;
import java.util.Scanner;

public class SumUpToZero {
    public static int[] SumUpToZero (int num){
        int[]numbers= new int[num];
        int sum =0;
        for (int i = 0; i < num; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number in the array");
            numbers[i]= input.nextInt();
            sum+=numbers[i];
        }
        if(sum==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(SumUpToZero(4)));
    }
}
/*
given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
                        The method can return any such array.
                        For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
                        The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
                        For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).

 */