package Interview_questions.java;

public class MaxAndMin {
    public static int max(int[] arr) {
        int num = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>num){
                num = arr[i];
            }
        }
        return num;
    }

    public static int min(int[] arr) {
        int num = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<num){
                num = arr[i];
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,8};
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
}
