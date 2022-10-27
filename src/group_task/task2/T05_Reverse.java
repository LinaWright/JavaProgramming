package group_task.task2;

public class T05_Reverse {
    public static String ReverseString (String str){
        String Reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            Reversed += str.charAt(i) +"";
        }
        return Reversed;
    }

    public static void main(String[] args) {
        System.out.println(ReverseString("ABCD"));
    }
}
