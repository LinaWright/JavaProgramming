package day32_array;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class Groups {
    public static void main(String[] args) {
        String[][] Cydeo = new String[4][];
        // String [][] Cydeo =new String[4][3]; --> [[null, null, null], [null, null, null], [null, null, null], [null, null, null]]
        //4 inner arrays that each have a size of 4
        System.out.println(Arrays.deepToString(Cydeo));
        String[] groupOne = {"Emre", "Yasir", "Eda"};
        Cydeo[0] = groupOne;
        System.out.println(Arrays.deepToString(Cydeo));

        System.out.println("Adding group 2");
        String[] groupTwo = {"Barsi", "Demet", "Shina", "Ismayil"};
        Cydeo[1] = groupTwo;
        System.out.println(Arrays.deepToString(Cydeo));

        System.out.println("Adding group 3"); //syntax to creat an array without a reference
        Cydeo[2] = new String[] {"Mustafa", "Lima"};
        System.out.println(Arrays.deepToString(Cydeo));

        System.out.println("Same group 3 as group 4");
        Cydeo[3] = Cydeo[2];
        System.out.println(Arrays.deepToString(Cydeo));

        System.out.println();
        for(String[]innerArray:Cydeo){//loops through the 2d array, Cydeo
            for (String eachWord:innerArray) { //loops through every String element in each 1d inner array
                System.out.println(eachWord);
            }
        }
    }
}

