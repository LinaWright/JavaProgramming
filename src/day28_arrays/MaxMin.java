package day28_arrays;

public class MaxMin {
    public static void main(String[] args) {
        int [] number = {500, 120, -80, 90, 250, -10};
        int maxNumber = number[0];
        int minNumber = number[0];
        for (int i = 0; i < number.length; i++) {
            if(maxNumber<number[i]){
                maxNumber=number[i];
                System.out.println(maxNumber);
            }
            if(minNumber>number[i]){
                minNumber=number[i];
                System.out.println(minNumber);
            }
        }
    }
}
 /*

        declare and assign an array

        500, 120, -80, 90, 250, - 10

        find the biggest number in the array

        find the smallest number in the array

     */