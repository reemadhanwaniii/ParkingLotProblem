package src.models.parking;

import src.models.mobility.VehicleType;

import java.util.List;

public class CarParkingSlot extends ParkingSlot implements CarSlot{

    public CarParkingSlot(int slotNo, ParkingFloor parkingFloor) {
        super(slotNo, parkingFloor, List.of(VehicleType.CAR,VehicleType.BIKE));
    }
}
