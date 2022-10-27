package homework_practices;

import java.util.ArrayList;

public class AddElementToArrayList {
    public static void main(String[] args) {
        /*
Create an ArrayList of Strings
add these elements:
	add Hat
	add Shoes
	add Jacket in middle of Hat and Shoes
	add Towel in the beginning
	add Car between Towel and Hat

Print the ArrayList after each action to see how the change is made
 */
        ArrayList<String>list = new ArrayList<>();
        list.add("Hat");
        list.add("Shoes");
        list.add(1,"Jacket");
        list.add(0,"Towel");
        System.out.println(list);
        list.add(1,"Car");
        System.out.println(list);

        /*
        Create an ArrayList of Strings
add these elements:
	Iron Man, Spider Man, Thor, Captain America, Hawkeye

	remove Thor by index

	remove Iron Man by element

	remove the first index

Print the ArrayList after each action to see how the change is made

         */
        System.out.println();

        ArrayList<String>heroes=new ArrayList<>();
        heroes.add("Iron Man");
        heroes.add("Spider Man");
        heroes.add("Thor");
        heroes.add("Captain America");
        heroes.add("Hawkeye");
        System.out.println(heroes);
        heroes.remove(2);
        System.out.println(heroes);
        heroes.remove("Iron Man");
        System.out.println(heroes);
        heroes.remove(0);
        System.out.println(heroes);
    }
}

