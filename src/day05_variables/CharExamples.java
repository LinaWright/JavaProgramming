package day05_variables;

public class CharExamples {
    public static void main(String[] args) {

        //assigning characters to char type, must use single quotation, single character
        char letterOne = 'a';
        char letterTwo = 'Z' ;
        char numberOne ='0'; //This is a char not a number, so we can't do math
        char specialOne = '$' ;
        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);
        System.out.println(letterOne+letterTwo);//every letter has a value, this is doing math

        char letterThree = 65; //The type is character, when you put a number in, it'll show the letter that related to the number.
        //char letterThree ='A';
        //letterThree = '65'; this is invalid because there is two character
        System.out.println(letterThree);


        System.out.println(letterOne + letterTwo + numberOne); //Original
        System.out.println(letterOne + "" +letterTwo + "" + numberOne);//putting spaces between each char
        System.out.println("char: " + letterOne + letterTwo + numberOne); //String type, not Char anymore
    }
}
