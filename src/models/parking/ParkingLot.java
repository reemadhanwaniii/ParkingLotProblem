package src.models.parking;

import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> parkingFloors;

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }
}
