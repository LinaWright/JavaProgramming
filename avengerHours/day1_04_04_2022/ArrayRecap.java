package day1_04_04_2022;

public class ArrayRecap {
    /*
    Array --> an obj that can hold multiple values of same datatype simultaneously

    index starts with 0 (like Strings)

    -Declaration
    -Instantiation
    -Initialization

     */
    public static void main(String[] args) {
        int a;
        //declaration
        int[]nums;
        //nums[0] = 3;

        //Instantiation
        nums = new int[4]; //[0,0,0,0] (initializes my array with default values)
        nums[0]=5;//[5,0,0,0]

        //declaration + instantiation at the same line
        int[]nums2=new int[3]; //[0,0,0]

        //initialization
        int[]nums3={1,2,3,4}; //[1,2,3,4]

        int[]nums4 = new int[]{10,20,30};

    }
}
