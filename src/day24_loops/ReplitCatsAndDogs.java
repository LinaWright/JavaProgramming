package day24_loops;

import java.util.Scanner;

public class ReplitCatsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length()-3; i++) {
            if(("" + str.charAt(i)).equals("c")&&("" + str.charAt(i+1)).equals("a")&&("" + str.charAt(i+2)).equals("t")){
                countCat++;
            }
            if(("" + str.charAt(i)).equals("d")&&("" + str.charAt(i+1)).equals("o")&&("" + str.charAt(i+2)).equals("g")){
                countDog++;
            }
        }


        if((str.substring(str.length()-3, str.length())).equals("cat")){
            countCat++;
        } else if ((str.substring(str.length()-3, str.length())).equals("dog")){
            countDog++;
        }
        if(countCat==countDog){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

}
/*
Use a loop to count how many times the characters cat and dog are found in the given String str. Output true if cat and dog appear the same
number of times, otherwise output false
Main topics: loops, primitive datatypes, operators, Scanner, String, if statements


Ex:
  Input:
    catdog

  Output:
    true

Ex:
  Input:
    catcat

  Output:
    false
Ex:
  Input:
    cat-cheetah-dog-cat
    ​
  Output:
    false
 */