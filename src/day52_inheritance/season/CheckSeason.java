package day52_inheritance.season;

public class CheckSeason {
    public static void main(String[] args) {
        Winter winter = new Winter("Winter",60,20);
        System.out.println(winter);
        winter.activity();

        Spring spring = new Spring("Spring", 70,50);
        System.out.println(spring);
        spring.activity();
    }
}
/*
Create a class CheckSeason

	create an object of Winter, Summer, Fall and Spring and verify if constructor, toString(), and activity() are working properly for each class

	List the is a relations of all the classes
 */