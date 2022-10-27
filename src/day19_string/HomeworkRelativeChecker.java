package day19_string;

import java.util.Scanner;

public class HomeworkRelativeChecker {
    /*
      Given two full names check if the two people are related. They will be considered to be related
if they have the same last name
    Ex:
Input:
          James Bond
          Jamie Bond
Output:
Related

Input:
          James Bond
          Alex Benji
Output:
Not Related
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two full names: ");
        String firstOne = input.nextLine();
        String secondOne = input.nextLine();
        int firstSpace = firstOne.indexOf(" ");
        int secondSpace = secondOne.indexOf(" ");

        String lastName1 = firstOne.substring(firstSpace,firstOne.length());
        String lastName2 = secondOne.substring(secondSpace,secondOne.length());

        if(lastName2.equals(lastName1)){
            System.out.println("related");
        }else{
            System.out.println("not related");
        }
    }
}
