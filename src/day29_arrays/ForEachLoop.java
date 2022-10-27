package day29_arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[]nums = {30,12,159,12};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Traditional loop " + nums[i]);
        }
        System.out.println();
        for(int element : nums){
            System.out.println("for each: " + element);
        }

        //String example
        String[]classes = {"Java","soft skills","database","api","selenium"};
        //traditional
        for(int i = 0; i<classes.length;i++){
            System.out.println(classes[i]);
        }
        System.out.println();
        //for each
        for(String word : classes){
            System.out.println(word);
        }

        //double example
        double[]price = {10.4,40.2,410.2};
        //for each loop
        for(double each : price){
            System.out.println("$ " + each);
        }

    }
}
