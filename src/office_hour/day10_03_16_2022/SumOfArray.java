package office_hour.day10_03_16_2022;

public class SumOfArray {
 public static void main(String[] args) {

            int [] array= {1,2,2,6,99,99,7,4,6,4,4,5,4};
            int sum=0;
            boolean checkSix=false;

            for(int i=0; i<array.length; i++) {

                if(checkSix) {

                    if(array[i]==7) {
                        checkSix=false;
                    }
                } else if(array[i]==6) {

                    checkSix=true;

                } else {
                    sum+=array[i];
                }
            }
            System.out.println(sum);

        }
    }
    /*
Task 07 :  Write a method that accepts an array and prints the total of the numbers in the
        array, except ignore sections of numbers starting with a 6 and extending to the
        next 7 (every 6 will be followed by at least one 7).

            int[] x = {1,2,2} = > 5
            int[] y = {1, 2, 2, 6, 99, 99, 7} = > 5
            int[] a = {1,1,6,7,2} = > 4
            int[] b = {1,1,6,2} = > 2
            int[] c = {1,2,2,6,99,99,7,3,4} = > 12
 */