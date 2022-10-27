package Interview_questions.java;

public class DuplicateCharacters {
    /*
    [IQ] Duplicate characters

    Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

    Ex:
        Input:
            AAABCCDEEF
        Output:
            ACE

        -> the characters A C and E are found in the String multiple times so they are duplicates

     */
    public static String duplicateChas (String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(!result.contains(str.charAt(i)+"")){
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if(str.charAt(j)==str.charAt(i)){
                        count++;
                    }

                    }if(count>1){
                        result += str.charAt(i)+"";
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "AAABCCDEEF";
        System.out.println(duplicateChas(str));
    }
}
