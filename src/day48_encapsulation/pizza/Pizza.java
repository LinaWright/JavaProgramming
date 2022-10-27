package day48_encapsulation.pizza;

public class Pizza {
    private String size;
    private int Topping;

    public Pizza(String size, int topping) {
        setSize(size);
        setTopping(topping);
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")) {
            this.size = size;
        }
    }

    public void setTopping(int topping) {
        if (topping >= 0) {
            this.Topping = topping;
        }
    }

    public String getSize() {
        return size;
    }

    public int getTopping() {
        return Topping;
    }

    /*
        public double calculatePrice() {
            double price = 0.0;
            switch (size) {
                case "small":
                    price += 4;
                case "medium":
                    price += 6;
                case "large:":
                    price += 8;
            }
            price += 0.75 * getTopping();
            return price;
        }

     */
    public double calculatePrice() {

        double price = size.equalsIgnoreCase("small") ? 4 : size.equalsIgnoreCase("medium") ? 6 : 8;

        return price + (Topping * 0.75);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", Topping=" + Topping +
                '}' + "\nCost of Pizza" + calculatePrice();
    }
}

  /*
        create a class called Pizza

        - data:

            size (String), number of toppings

        - constructor

            - create a constructor that creates a Pizza object with the length and the width

                call setters here

        - encapsulate the Pizza class

            - setter condition:
                size can only be:
                    small, medium, or large

                number of toppings must be a positive number

        - other methods methods:

            - calculatePrice()
                    calculate the price of the pizza based on:

                        small base: $4
                        medium base: $6
                        large base: $8

                        each topping adds $0.75 to the price

                        calculate the total price and return the cost

            - toString()
                print the size, number of toppings, and cost of the pizza
     */