package Interview_questions.java;

public class FrequencyOfChar {
        /*
1) String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
    public static String frequencyOfChar(String str){
        String frequency= "";

        for (int i = 0; i < str.length(); i++) {

            if(frequency.contains(str.charAt(i)+"")){
                continue;
            }
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            frequency += str.charAt(i)+""+count;
        }
        return frequency;
    }

    public static void main(String[] args) {
        String str = "AAABBCDD";
        System.out.println("frequencyOfChar(str) = " + frequencyOfChar(str));
    }
}
