package day23_loops;

public class CountLetter {
    public static void main(String[] args) {
        String str = "aabbaaa";
        char findChar = 'a';
        int howManyTimes = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==findChar){ //checks if every character is equal to 'a'
                howManyTimes += 1;
            }
        }System.out.println(howManyTimes);
    }
}
 /*

            Given a String we want to count how many 'a' characters we have

            Challenge: adjust so that we can check for not only 'a' but any character

            Ex: aabbaaa

            5

         */