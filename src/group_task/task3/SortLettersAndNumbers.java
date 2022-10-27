package group_task.task3;


import java.util.Arrays;

public class SortLettersAndNumbers {
    /*
     String - Sort Letters and Numbers from alphanumeric String
    Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together. Ex:
    Input:  "DC501GCCCA098911"
    OutPut: "CD015ACCCG011899"
     */
    public static void main(String[] args) {
        String a = "DC501GCCCA098911GA32";
        String result = "";
        for (int i = 0; i < a.length() - 1; i++) {
            if (Character.isLetter(a.charAt(i))) {
                result += a.charAt(i);
            }
            if (Character.isDigit(a.charAt(i))) {
                result += a.charAt(i);
            }
            if (Character.isDigit(a.charAt(i)) && Character.isLetter(a.charAt(i + 1))) {
                result += " ";
            }
            if (Character.isLetter(a.charAt(i)) && Character.isDigit(a.charAt(i + 1))) {
                result += " ";
            }
        }

        String[] aa = result.split(" ");
        String ss = "";//{DC 501 GCCCA 098911 GA 32}
        for (String each : aa) {
            char[] chars = each.toCharArray();
            Arrays.sort(chars);
            for (char eachChar : chars) {
                ss += "" + eachChar;
            }
        }
        System.out.println(ss);
    }
}


