package day54_abstraction.language;

public class Translator {
    public static void main(String[] args) {
      //  Language obj = new Language(); cannot creat object of interface
        Spanish spanish = new Spanish();
        spanish.hi();
        spanish.bye();

        Turkish turkish = new Turkish();
        turkish.hi();
        turkish.bye();
    }
}
