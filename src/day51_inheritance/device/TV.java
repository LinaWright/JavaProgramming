package day51_inheritance.device;

public class TV extends Device {
    public TV() {
        super("Samsung", "String model", 1000, true);
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", wireless=" + wireless +
                '}';
    }
    @Override
    public void useDevice() {
        super.useDevice();
    }
}
/*
Create a class called TV:
- attributes: brand, model, price, wireless
- methods: toString(),
	useDevice(): Override to print Using TV
 */