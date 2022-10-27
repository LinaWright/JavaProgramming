package homework_practices.entertainment;

import java.util.ArrayList;

public class Youtube extends Streaming{
    String videoName;
    String channelName;
    int viewCount;
    ArrayList comments;

    public Youtube(String name, String company, double duration, String videoName, String channelName, int viewCount, ArrayList comments) {
        super(name, company, duration);
        this.videoName = videoName;
        this.channelName = channelName;
        this.viewCount = viewCount;
        this.comments = comments;
    }
}
