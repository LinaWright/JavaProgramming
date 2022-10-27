package homework_practices.entertainment;

public class GetEntertained {
    public static void main(String[] args) {
        Netflix netflix = new Netflix("Netflix","Unsure",1.20,"Love is blind",1,1);

        System.out.println(netflix.name);
        System.out.println(netflix.company);
        System.out.println(netflix.showName);
        System.out.println(netflix.duration);
        System.out.println("Season: " + netflix.seasonNumber + ", Episode: " + netflix.episodeNumber);

        System.out.println();

        KevinHart kevin = new KevinHart("Kevin","KevinHart", "Chicago", "James","11/4/21");

        System.out.println(kevin.name);
        System.out.println(kevin.company);
        System.out.println(kevin.date);
        System.out.println(kevin.location);


    }
}
