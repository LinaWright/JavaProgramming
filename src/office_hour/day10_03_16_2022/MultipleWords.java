package office_hour.day10_03_16_2022;

public class MultipleWords {
    public static void main(String[] args) {

    String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
    String[]Split = words.split(", ");
        for (int i = 0; i < Split.length; i++) {
            if(Split[i].contains(" ")){
                System.out.println(Split[i]);
            }
        }
}
}
/*
Task 03 : Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

        output : wooden spoons
        		 trash can
         		 dish washer
 */