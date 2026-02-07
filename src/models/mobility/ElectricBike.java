package src.models.mobility;

public class ElectricBike extends Vehicle implements ElectricVehicle{
    public ElectricBike(String color, String registrationNo, VehicleType vehicleType) {
        super(color, registrationNo, vehicleType);
    }
    @Override
    public void charge() {
        System.out.println("Bike is charging");
    }

    @Override
    public float getBatteryPercent() {
        return 0;
    }

}
