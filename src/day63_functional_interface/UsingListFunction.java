package day63_functional_interface;

import day54_abstraction.creating.Create;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsingListFunction {
    public static void main(String[] args) {
        //Use ListFunction functional interface to:
        //		1.1 Create a function that can return the maximum number from a list of Integer

        ListFunction<Integer, Integer> maxNumber = (a) -> {
            Collections.sort(a);
            Integer max = a.get(a.size() - 1);
            return max;
        };

        List<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer maxNum = maxNumber.apply(list);
        System.out.println("Max number from the given List is " + maxNum);

        System.out.println("---------------------------------------------------");


        //1.2 Create a function that can return the minimum number from a list of Integer

        ListFunction<Integer, Integer> minNumber = (a) ->{
            Collections.sort(a);
            Integer min = a.get(0);
            return min;
        };
        List <Integer> l = new ArrayList<>(Arrays.asList(2,45,100,467,1));

        Integer minInt = minNumber.apply(list);
        System.out.println("Min number from the given List is " + minInt);

        System.out.println("---------------------------------------------------");

//        1.3 Create a function that can return the longest String from a List of String
        ListFunction <String, String> longestString = (str) -> {
            String LongestString =  str.get(0);
            for (int i = 0; i < str.size(); i++) {
                if (str.get(i).length()>LongestString.length()){
                    LongestString = str.get(i);
                }
            }
//            for(String each : str){
//
//                if(each.length() > longest.length()){
//                    longest = each;
//                }
//            }
//            return longest;
            return LongestString;
        };
        List <String> s = new ArrayList<>(Arrays.asList("Java", "Sun","Washington","Dog"));

        System.out.println("Longest String from a List is "+ longestString.apply(s));


        System.out.println("---------------------------------------------------");

        //1.4 Create a function that can return the shortest String from a List of String
        ListFunction<String, String> shortestString = (str) -> {
            String ShortestString = str.get(0);
            for(String each : str){
                if(each.length()<ShortestString.length()){
                    ShortestString = each;
                }
            }
            return ShortestString;
        };

        List <String> b = new ArrayList<>(Arrays.asList("Java", "Sunset","Washington","Dog"));

        System.out.println("Shortest String from a List is "+ shortestString.apply(b));

        System.out.println("---------------------------------------------------");


        //1.5 Create a function that can convert List of integer to int array

        ListFunction<Integer, int[]>convertListToArr=(c)->{
            int [] arr = new int[c.size()];
            for(int i=0; i<c.size();i++){
                arr[i] = c.get(i);
            }
            return arr;
        };

        //List <Integer> l = new ArrayList<>(Arrays.asList(2,45,100,467,1)); reusing this list

        int[] array = convertListToArr.apply(l);

        System.out.println("Converted int array "+ Arrays.toString(array));


        System.out.println("---------------------------------------------------");

        //1.6 Create a function that can convert List of double to double array

        ListFunction<Double, double[]>convertListToDoubleArr = (d)->{
            double[]arr2 = new double[d.size()];
            for (int i = 0; i < d.size(); i++) {
                arr2[i] = d.get(i);
            }
            return arr2;
        };
        List <Double> d = new ArrayList<>(Arrays.asList(2.4, 5.6, 1.9, 7.8, 23.0));

        double[] doubles = convertListToDoubleArr.apply(d);

        System.out.println("Converted double array "+ Arrays.toString(doubles));

    }
}
