package homework_practices;

import java.util.Arrays;

public class MultidimensionalCalculation {
    public static void main(String[] args) {
        int [][] arr1 = {
                {1, 2, 3},
                {2, 5, 10},
                {0, 3, 20}
        };
        int [][] arr2 = {
                {10, 4, 3},
                {5, 2, 7},
                {100, 20, 5}
        };
        int [][] newArr = new int [3][3];
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr.length; j++) {
                newArr[i][j] = arr1[i][j] * arr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(newArr));
            }
        }


    /*
    newArr [0][0] = arr1[0][0] * arr2[0][0];
    newArr [0][1] = arr1[0][1] * arr2[0][1];
    newArr [0][2] = arr1[0][2] * arr2[0][2];

    Given two 2D arrays multiply them together and store the results into a
    new 2D array. Multiple each number in each position as its own calculation
    Ex:
    {1, 2, 3}
    {2, 5, 10}
    {0, 3, 20}
    x
    {10, 4, 3}
    {5, 2, 7}
    {100, 20, 5}
    Output:
    {10, 8, 9}
    {10, 10, 70}
    {0, 60, 100}
     */