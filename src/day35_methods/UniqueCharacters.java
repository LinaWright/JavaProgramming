package day35_methods;

import my_utilties.StringUtil;

public class UniqueCharacters {
    public static String uniqueCharacters(String str){

        String unique = "";
        String checked = "";

        for(int i = 0; i < str.length(); i++){

            if(!checked.contains("" + str.charAt(i))){
                int count = StringUtil.frequencyOfCharacter(str, str.charAt(i));
                checked += str.charAt(i);

                if(count == 1){
                    unique += str.charAt(i);
                }
            }
        }

        return unique;
    }

}

 /*
    Unique Characters

create a method that will accept a word(String) and return a String with all the unique characters. A character is unique if it only appears in the String once.

Hint: use your frequency method to do some of the work

Ex:
    Input:
        aaaaabcccdeeff

    Output:
        bd
     */
