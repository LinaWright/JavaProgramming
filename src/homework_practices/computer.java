package homework_practices;

public class computer {
    double price;
    String brand;
    String color;

    static boolean hasScreen = true;
    static boolean hasBattery =true;
    static boolean hasMemory = true;

    public computer(double price, String brand, String color) {
        this.price = price;
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "computer{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
