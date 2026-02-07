package src.models.parking;

import src.models.mobility.VehicleType;

import java.util.List;

public class ElectricBikeParkingSlot extends ParkingSlot implements ElectricSlot{


    public ElectricBikeParkingSlot(int slotNo, ParkingFloor parkingFloor) {
        super(slotNo, parkingFloor, List.of(VehicleType.ELECTRIC_BIKE));
    }

    @Override
    public void chargeVehicle() {
        System.out.println("Charging Electric Vehicle");
    }
}
