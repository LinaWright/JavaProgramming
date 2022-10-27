package day43_custome_classes;

public class UseTrafficLights {
    public static void main(String[] args) {

        TrafficLights light = new TrafficLights("Green");
        System.out.println(light.color);

        TrafficLights light2 = new TrafficLights("Red");
        System.out.println(light2.color);
    }
}
