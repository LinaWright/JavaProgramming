package homework_practices.entertainment;

public class KevinHart extends LiveShow{
    String performer;
    String date;

    public KevinHart(String name, String company, String location, String performer, String date) {
        super(name, company, location);
        this.performer = performer;
        this.date = date;
    }
}
