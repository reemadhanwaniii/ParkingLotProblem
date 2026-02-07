package src.models.parking;

import src.models.mobility.VehicleType;

import java.util.List;

public class ElectricCarParkingSlot extends ParkingSlot implements ElectricSlot{

    public ElectricCarParkingSlot(int slotNo, ParkingFloor parkingFloor) {
        super(slotNo, parkingFloor, List.of(VehicleType.ELECTRIC_CAR,VehicleType.ELECTRIC_BIKE));
    }

    @Override
    public void chargeVehicle() {
        System.out.println("Charging Electric Vehicle");
    }
}
