package src.models.parking;

import src.models.mobility.Vehicle;

import java.util.Optional;

public interface FindSlotStrategy {
    Optional<ParkingSlot> findParkingSlot(ParkingLot parkingLot, Vehicle vehicle);
}
