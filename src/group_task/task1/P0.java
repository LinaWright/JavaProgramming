package group_task.task1;

public class P0 {
    /**
     * String = “aaabbcd”
     */
    public static String reverse(String str){
        String newStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            newStr+=str.charAt(i);
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str= "aabbcd";
        System.out.println(reverse(str));
    }
}
