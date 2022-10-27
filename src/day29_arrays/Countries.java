package day29_arrays;

public class Countries {
    public static void main(String[] args) {
        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"};

        for (int i = 0; i < countries.length; i++) {
            String lastChar = countries[i].substring(countries[i].length()-1);

            if(lastChar.equals("a")){
                System.out.println(countries[i]);
            }
            System.out.println(countries[i].substring(0,1) + lastChar);
            }
//        if(countries.contains("United States")){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
    }
}
    /*
    Countries
    Given a String array of countries:
    String[] countries = {
    "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
    "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
    "Honduras", "Indonesia", "United States"
    };
    - Find and print all the first and last characters of each country
    - Find and print all the countries that end with the letter ‘a’
    - Create “contains logic” to check if there is a certain country in the array. Can check for
    the United States, or use Scanner to check any country
     */