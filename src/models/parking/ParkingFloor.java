package src.models.parking;

import java.util.List;

public class ParkingFloor {
    private int floorNo;
    private List<ParkingSlot> parkingSlots;

    public ParkingFloor(int floorNo, List<ParkingSlot> parkingSlots) {
        this.floorNo = floorNo;
        this.parkingSlots = parkingSlots;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

   public void addParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlots.add(parkingSlot);
   }
}
