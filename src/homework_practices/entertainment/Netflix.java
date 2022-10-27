package homework_practices.entertainment;

public class Netflix extends Streaming{
    String showName;
    int episodeNumber;
    int seasonNumber;

    public Netflix(String name, String company, double duration, String showName, int episodeNumber, int seasonNumber) {
        super(name, company, duration);
        this.showName = showName;
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
    }
}
