package day48_encapsulation.flight;

public class FlightTicket {
    private String type;
    private String departureLocation;
    private String arrivalLocation;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(type.equalsIgnoreCase("first")||type.equalsIgnoreCase("business")||type.equalsIgnoreCase("economy")){
            this.type = type;
        }
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public FlightTicket(String type, String departureLocation, String arrivalLocation) {
        setType(type);
        setArrivalLocation(arrivalLocation);
        setDepartureLocation(departureLocation);
    }

    @Override
    public String toString() {
        return "FlightTicket{" +
                "type='" + type + '\'' +
                ", departureLocation='" + departureLocation + '\'' +
                ", arrivalLocation='" + arrivalLocation + '\'' +
                '}';
    }
}
