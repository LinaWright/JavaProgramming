package day47_encapsulation;

import day46_static.CydeoStudent;

public class School {
    public static void main(String[] args) {
        //calling the class in a different package day46

        CydeoStudent emre = new CydeoStudent("Emre", 5);

        System.out.println(emre);

        System.out.println();
        CydeoStudent.printStaticInfo();

        System.out.println();
        emre.printStaticInfo();

        System.out.println();

        System.out.println(CydeoStudent.instructors[0]);
    }

}
