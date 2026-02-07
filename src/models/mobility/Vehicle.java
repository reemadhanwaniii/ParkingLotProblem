package src.models.mobility;

public class Vehicle {
    private String color;
    private String registrationNo;
    private VehicleType vehicleType;

    public Vehicle(String color, String registrationNo, VehicleType vehicleType) {
        this.color = color;
        this.registrationNo = registrationNo;
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
