package homework_practices;

public class WrapperClassPractice1 {
    public static void main(String[] args) {
    String str = "JAVA javua";
    int upper = 0;
    int lower = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))){
                upper++;
            }else if(Character.isLowerCase(str.charAt(i))){
                lower++;
            }
        }
        if(upper == lower){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
}
}
/*
Write program that returns true if the total number of uppercase
characters are equal to total number of lowercase characters of a
string

Ex:
	str = "JAVA java";

output:

	true
 */