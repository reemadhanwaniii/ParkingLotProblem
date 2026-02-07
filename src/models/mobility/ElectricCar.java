package src.models.mobility;

public class ElectricCar extends Vehicle implements ElectricVehicle{
    public ElectricCar(String color, String registrationNo, VehicleType vehicleType) {
            super(color, registrationNo, vehicleType);
    }

    @Override
    public void charge() {
        System.out.println("Car is charging");
    }

    @Override
    public float getBatteryPercent() {
        return 0;
    }
}
