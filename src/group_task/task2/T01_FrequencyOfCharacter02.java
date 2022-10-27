package group_task.task2;

public class T01_FrequencyOfCharacter02 {

    public static String frequencyMeth(String str) {//return type string

        String checked = ""; //I created an empty String container , named it checked.
        for (int i = 0; i < str.length(); i++) {//created for loop to check all elements one by one

            if (checked.contains("" + str.charAt(i))) {
                continue;//if the letter is same it will ignore it and not add it into the checked container. if it is not same it will be added to the checked container
            }
            int count = 0;

            for (int j = 0; j < str.length(); j++) {//to find out how many times the letter occurs in the string( given string value)
                if (str.charAt(i) == str.charAt(j)) {//if str.charAt(i)  equals  str.charAt(j) count will increase
                    count++;
                }
            }
            checked += str.charAt(i) + "" + count;//it will give the number next to the each letter. number shows how many of them was in t he given string value.  ex:A3B2C1D2
        }
        return checked;

    }
    public static void main(String[] args) {
        System.out.println(frequencyMeth("AAABBCDD"));
    }
}

