package group_task.task3;

public class ArrayFindMaxMin {
    /*
     Array - Find Maximum
    Write a method that can find the maximum number from an int Array
     Array - Find Minimum
    Write a method that can find the maximum number from an int Array
     */

    public static int Maximum (int[]arr){
        int maxNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxNum){
                maxNum = arr[i];
            }
        }

        return maxNum;
    }

    public static int Minimum (int[]arr){
        int minNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<minNum){
                minNum = arr[i];
            }
        }

        return minNum;
    }

    public static void main(String[] args) {
        int[]arr = {1,5,8,3,4,7};
        System.out.println(Maximum(arr));

        System.out.println(Minimum(arr));
    }

}


