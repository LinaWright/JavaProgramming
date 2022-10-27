package day35_methods;

import java.util.Locale;

public class fixFormat {

    public static String fixFormat(String str){
        String Fixed = "";
        for (int i = 0; i < str.length(); i++) {
            Fixed = str.substring(0,1).toUpperCase(Locale.ROOT) + str.substring(1).toLowerCase(Locale.ROOT);
        }
        return Fixed;
    }
}
    /*
     public static String fixFormat(String str){
        str = str.trim();
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();

        Fix Format
    create a method will accept a String and return a String in proper format.
    Proper format is:
    First character starting as uppercase and the rest as lowercase
    Ex:
    Input:
    jamES
    Output:
    James
     */