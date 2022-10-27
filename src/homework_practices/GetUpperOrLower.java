package homework_practices;

import java.util.ArrayList;

public class GetUpperOrLower {
    public static void main(String[] args) {
        String input = "heLLoWoRlD";
        ArrayList<String>Lower = new ArrayList<>();
        ArrayList<String>Upper = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)>='a'&&input.charAt(i)<='z'){
                Lower.add(""+input.charAt(i));
            }else {
                Upper.add(""+input.charAt(i));
            }
        }
        System.out.println(Lower);
        System.out.println(Upper);
    }
}
