package day46_static;

import java.util.ArrayList;
import java.util.Arrays;

public class CydeoStudent {
    public String name;
    public int groupNumber;

    public static int batchNumber;
    public static String [] instructors;
    public static String schoolName;

    //You can assign and declare at the same time, but it is not recommended, we will use static block to assign
    static {
        batchNumber = 26;
        instructors = new String[]{"Nadir","Mehmet","Austin","aysun","saim"};
        schoolName = "Cydeo";
        printStaticInfo();
    }

    public static void printStaticInfo(){
        System.out.println("School name " + schoolName);
        System.out.println("Batch number " + batchNumber);
        System.out.println("Instructors " + Arrays.toString(instructors));
    }

    public CydeoStudent(String name, int groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }
}
