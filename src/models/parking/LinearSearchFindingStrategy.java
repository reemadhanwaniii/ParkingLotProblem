package src.models.parking;

import src.models.mobility.Vehicle;

import java.util.Optional;

public class LinearSearchFindingStrategy implements FindSlotStrategy {

    @Override
    public Optional<ParkingSlot> findParkingSlot(ParkingLot parkingLot, Vehicle vehicle) {
        for(ParkingFloor floor : parkingLot.getParkingFloors()) {
            for(ParkingSlot slot : floor.getParkingSlots()) {
                if(slot.isSlotAvailable() && slot.isVehicleSupported(vehicle)) {
                    slot.display();
                    return Optional.of(slot);
                }
            }
        }
        return Optional.empty();
    }
}
