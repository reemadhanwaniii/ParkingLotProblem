package src.models.parking;

import src.models.mobility.Vehicle;
import src.models.mobility.VehicleType;

import java.util.List;
import java.util.Optional;

public class ParkingSlot {
    private final int slotNo;
    private final List<VehicleType> supportedVehicleTypes;

    private ParkingSlotStatus status;
    private ParkingFloor parkingFloor;
    private Optional<Vehicle> vehicle;

    public ParkingSlot(int slotNo,ParkingFloor  parkingFloor,List<VehicleType> supportedVehicleTypes) {
        this.slotNo = slotNo;
        this.status = ParkingSlotStatus.EMPTY;
        this.parkingFloor = parkingFloor;
        this.parkingFloor.addParkingSlot(this);
        this.supportedVehicleTypes = supportedVehicleTypes;
        this.vehicle = Optional.empty();
    }

    public int getSlotNo() {
        return slotNo;
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public ParkingSlotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingSlotStatus status) {
        this.status = status;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public Optional<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(Optional<Vehicle> vehicle) {
        this.vehicle = vehicle;
        this.status = ParkingSlotStatus.OCCUPIED;
    }

    public void removeVehicle() {
        this.vehicle = Optional.empty();
        this.status = ParkingSlotStatus.EMPTY;
    }

    public boolean isSlotAvailable() {
        return this.status.equals(ParkingSlotStatus.EMPTY);
    }

    public boolean isVehicleSupported(Vehicle vehicle) {
        return supportedVehicleTypes.contains(vehicle.getVehicleType());
    }

    public void display() {
        System.out.println("Parking Slot " + this.slotNo);
        System.out.println("Parking Slot Status: :" + this.status);
        System.out.println("Parking Slot Floor: " + this.parkingFloor);
        System.out.println("Supported Vehicle Types: " + this.supportedVehicleTypes);
        if(vehicle.isPresent()) {
            System.out.println("Vehicle Registartion No :" + vehicle.get().getRegistrationNo() + " , Vehicle color : " + vehicle.get().getColor());
        }
    }
}
