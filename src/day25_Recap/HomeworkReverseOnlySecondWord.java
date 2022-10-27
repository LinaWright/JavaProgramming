package day25_Recap;

public class HomeworkReverseOnlySecondWord {
    public static void main(String[] args) {
        String str = "I love java";
        String firstWord = str.substring(0, str.indexOf(' ')+1);
        String secondWord = str.substring(str.indexOf(' '), str.lastIndexOf(' '));
        String thirdWord = str.substring(str.lastIndexOf(' '), str.length());
        String reverse = "";
        for (int i = secondWord.length() - 1; i > 0; i--) {
            reverse += "" + secondWord.charAt(i);

        }

        System.out.println(firstWord + reverse + thirdWord);
    }
}
/* Saim's code
  Scanner input = new Scanner(System.in);
        System.out.println("Enter your 3 words");
        String str = input.nextLine().trim();

        int firstSpace = str.indexOf(" ");
        int lastSpace = str.lastIndexOf(" "); // str.indexOf(" ", firstSpace + 1);

        String middleWord = str.substring(firstSpace + 1, lastSpace);
        String reverse = "";

        for(int i = middleWord.length() - 1; i >= 0; i--){
            reverse += middleWord.charAt(i);
        }

        System.out.println(str.substring(0, firstSpace + 1) + reverse + str.substring(lastSpace));

        // str = str.replace(middleWord, reverse)
        // System.out.println(str);

Reverse only second word [String, Loops]

Given a String with three words separated by spaces. Reverse only the second word and return the modified String
	Ex:
	I love java

	Ouput:
	I evol java
 */