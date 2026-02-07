package src.models.parking;

import src.models.pricing.PricingStrategy;

import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> parkingFloors;
    private List<PricingStrategy> pricingStrategies;

    public void setParkingFloors(List<ParkingFloor> parkingFloors, List<PricingStrategy> pricingStrategies) {
        this.parkingFloors = parkingFloors;
        this.pricingStrategies = pricingStrategies;
    }

    public void addParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloors.add(parkingFloor);
    }

    public void removeParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloors.remove(parkingFloor);
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public List<PricingStrategy> getPricingStrategies() {
        return pricingStrategies;
    }
}
