package homework_practices;

import java.util.ArrayList;

public class SeparateParts {
    public static void main(String[] args) {
        String input = "ABCD123$%#@&456EFG!";
        ArrayList<String> Letter = new ArrayList<>();
        ArrayList<String>Special = new ArrayList<>();
        ArrayList<String>Num = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)>='A'&&input.charAt(i)<='Z'){
                Letter.add(""+input.charAt(i));
            }else if(input.charAt(i)>='0'&&input.charAt(i)<='9'){
                Num.add(""+input.charAt(i));
            }else{
                Special.add(""+input.charAt(i));
            }
        }
        System.out.println(Letter);
        System.out.println(Special);
        System.out.println(Num);
    }
}
    /*
    Write a program that can extract the special characters, digits and letters
    from a string and stores them into separate ArrayLists of Characters
    Ex:
    str = "ABCD123$%#@&456EFG!"
    list1: {$, %, #, @, &, !}
    list2: {A, B, C, D, E, F, G}
    list3: {1, 2, 3, 4, 5, 6}
     */