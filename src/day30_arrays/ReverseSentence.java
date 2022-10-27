package day30_arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = "today is Monday";
        String [] split = str.split(" ");
        String reversed = "";
        for(int i = split.length-1; i>=0; i--){
            reversed += split[i] + " ";
        }
        System.out.println(reversed.trim());
    }
}
