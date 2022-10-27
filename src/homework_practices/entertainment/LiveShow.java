package homework_practices.entertainment;

public class LiveShow extends Entertainment{
    String location;

    public LiveShow(String name, String company, String location) {
        super(name, company);
        this.location = location;
    }
}
