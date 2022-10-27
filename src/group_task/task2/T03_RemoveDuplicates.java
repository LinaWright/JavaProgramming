package group_task.task2;

public class T03_RemoveDuplicates {
    /*
    Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC") ==> ABC
     */
    public static String removeDuplicates(String str){
        String noDuplicates ="";

        for(int i = 0; i < str.length(); i++){

            if(!noDuplicates.contains("" + str.charAt(i))){

                    noDuplicates += str.charAt(i);
                }

            }

        return noDuplicates;
    }

    public static void main(String[] args) {
        System.out.println("removeDuplicates = " + removeDuplicates("ADAABBBCCEECEFGG"));
    }
}
