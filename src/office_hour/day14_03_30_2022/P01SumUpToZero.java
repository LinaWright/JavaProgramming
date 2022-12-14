package office_hour.day14_03_30_2022;

import java.util.Arrays;

public class P01SumUpToZero {
    public static int[] SumUpToZero(int N){
        //        return value      giving value
        int[]arr = new int[N];
        int sum = 0;
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=i;
            sum+=i;
        }
        arr[arr.length-1]=-sum;
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(SumUpToZero(3)));
    }
}

        /*
        my solution:
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

           Task 3:  Write a method that,
                       given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
                        The method can return any such array.
                        For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
                        The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
                        For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
         */
