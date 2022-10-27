package day23_loops;

public class PalindromeInterviewTask {
    public static void main(String[] args) {
        String word = "racecar";
        //reverse the String
        String reverse = "";

//        for (int i = 0; i <word.length() ; i++) {
//            System.out.print(word.charAt(i));
//        }
//        System.out.println();
        for (int i = word.length()-1; i >= 0 ; i--) {
            reverse += word.charAt(i); // characters are being read from the end and being added backwards a reverse String
        }
        if(word.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not Palindrome");
        }


//        for (int i = 20; i >=1 ; i--) {
//            System.out.println(i);
//        }
    }
}

/*
Palindrome: its the same reading from the beginning and end

        Ex:
            mom
            racecar
            anna
            madam

        Task: Check if a word is palindrome

        Flow:
            declare some initial String
            how to reverse a String
            check if the reverse version is the same as the original
 */