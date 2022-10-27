package homework_practices;

public class concatenateMultidimensionalArray {
    public static void main(String[] args) {
        String[][] arr1 = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"}
        };
        for (int i = 0; i < arr1.length; i++) {
            String last="";
            for (int j = 0; j < arr1[i].length; j++) {
                last+=arr1[i][j].charAt(arr1[i][j].length()-1);
            }
            System.out.println(last);
        }

    }
}
/*
Given a 2D String array, concatenate the last character of each inner
element on one line, then each following array values in separate lines
Ex:
{"James", "is", "back"}
{"he", "was", "never", "gone"}
{"methods", "tomorrow"}
Output:
ssk
esre
sw
 */