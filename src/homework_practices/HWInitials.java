package homework_practices;

public class HWInitials {
    public static void main(String[] args) {
        String[] name = {"James Bond", "Eve Rell", "Anna Johnson"};
        for (int i = 0; i < name.length; i++) {
        String fullName = name[i].trim();
        //for each loop
//            for(String str : names){
//                String fullName = str.trim();
//            }
        String lastName = fullName.substring(fullName.indexOf(" ")).trim();
        //indexOf(" ") + 1
            System.out.println("" + fullName.charAt(0) + lastName.charAt(0));
        }
    }
}
    /*
        Initials
        •Given an array of classmate’s names, first name and last separated by a
        space, print the initials of everyone
        Ex:
        Input:
        [ “James Bond”, “Eve Rell”, “Anna Johnson” ]
        Output:
        JB
        ER
        AJ
     */