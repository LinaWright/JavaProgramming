package group_task.task2;

public class T04_FindUnique {
    /*
    Write a return method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF") ==> "DEF"
     */

    public static String FindUnique (String str){
        String Unique = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if((str.charAt(i)+"").equals((str.charAt(j) +""))){
                    count++;
                }
            }
            if(count ==1){
                Unique+=str.charAt(i)+"";
            }
        }
        return Unique;
    }

    public static void main(String[] args) {
        System.out.println(FindUnique("AAABBBCCCDEF"));
    }
}
