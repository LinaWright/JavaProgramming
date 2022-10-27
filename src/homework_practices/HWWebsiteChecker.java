package homework_practices;

public class HWWebsiteChecker {
    public static void main(String[] args) {
        String [] str = {"bing.com","wikimedia.org","twitter.com","amazonaws.com","japanpost.jp","mysql.com","nasa.gov","linkedin.com",
                "ucla.edu","github.io","spotify.com","mozilla.org","nba.com","comcast.net","tamu.edu","utexas.edu"};
        int com = 0;
        int org = 0;
        int edu = 0;
        int other = 0;
        for (int i = 0; i < str.length; i++) {
            if(str[i].contains(".com")){
                com++;
            }else if(str[i].contains(".org")){
                org++;
            }else if(str[i].contains(".edu")){
                edu++;
            }else{
                other++;
            }
        }
        System.out.println("How many .com web: " + com);
        System.out.println("How many .org web: " + org);
        System.out.println("How many .edu web: " + edu);
        System.out.println("How many other web: " + other);
    }
}
    /*
    Website checker
    Given some urls determine how many .com, .org, and .edu websites
    there are. Also keep track of an ‘other’ category for websites that have
    a different domain
    Sample websites for an array:
    bing.com, wikimedia.org, twitter.com, amazonaws.com, japanpost.jp, mysql.com,
    nasa.gov, linkedin.com, ucla.edu, github.io, spotify.com, mozilla.org, nba.com,
    comcast.net, tamu.edu, utexas.edu,
     */