package src.models.parking;

import src.models.mobility.VehicleType;

import java.util.List;

public class BikeParkingSlot extends ParkingSlot implements BikeSlot {

    public BikeParkingSlot(int slotNo, ParkingFloor parkingFloor) {
        super(slotNo, parkingFloor,List.of(VehicleType.BIKE));
    }
}
