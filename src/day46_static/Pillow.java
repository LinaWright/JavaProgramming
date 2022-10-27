package day46_static;

public class Pillow {
    public static void main(String[] args) {
        Bed bed = new Bed();
        bed.pillows.add(new Pillow());
        bed.pillows.add(new Pillow());
        System.out.println(bed.pillows.size());
    }
}
