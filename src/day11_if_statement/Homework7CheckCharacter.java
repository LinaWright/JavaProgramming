package day11_if_statement;

public class Homework7CheckCharacter {
//    create a char variable with a letter (can only do this one hardcoded, no
//            Scanner method for char)
//    find out if the letter is an uppercase letter or lowercase letter. Print
//    the type of letter it is
//    ex:
//            'b'
//    lowercase
//    ex:
//            'U'
//    uppercase
public static void main(String[] args) {
    char letter = 'd';
//    if(letter >= 97 && letter<=122){
//        System.out.println("lowercase");
//    }
    if(letter>='a' && letter<='z'){
        System.out.println("lowercase");
    }
    if(letter>='A' && letter<='Z'){
        System.out.println("Uppercase");
    }
}
}
