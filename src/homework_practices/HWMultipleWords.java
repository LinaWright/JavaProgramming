package homework_practices;

public class HWMultipleWords {
    public static void main(String[] args) {
        String input = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] eachItem = input.split(", ");
        for (int i = 0; i < eachItem.length; i++) {
            if(eachItem[i].contains(" ")){
                System.out.println(eachItem[i]);
            }
        }

    }
}
/*
Multiple Words

Given a String of words that are separate by commas. Find and print any words that have more than one word

Example

	Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

	Output:
	wooden spoons
	trash can
	dish washer
 */