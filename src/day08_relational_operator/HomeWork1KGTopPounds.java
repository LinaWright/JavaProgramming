package day08_relational_operator;

public class HomeWork1KGTopPounds {
//    create a class called KgToPounds, and write a program that can convert Kg to pound and print the result
//            Ex:
//    kg = 10;
//    output:
//            10 kg equal to 22.0462 pounds
//            kg = 20
//    output:
//            20 kg equal to 44.0924 pounds
//                ....
//    Hint: 1kg = 2.20462 pounds
    public static void main(String[] args) {
        int kg = 10;
        double kgToPounds = 2.20462;
        double pounds = kg * kgToPounds;
        System.out.println(pounds);
        kg = kg + 10;
        double pounds2 = kg * kgToPounds; //This is important, in line 20 you declare and initialize a variable pounds2, which is where you do the math using
        // the kg variable with reassigned value. In line before, even though you declared the value of kg to be kg+10, variable pounds still had a previous
        // value assigned to it, which was 22.0462. Even though you know have assigned a new value to kg, you have to do the same with the other variable so
        // the compiler know what to compile next.
        // Code runs top to bottom, left to right, so in this case, the assigned value of pounds from line 18 will show up in your output
        System.out.println(pounds2);
    }
}
