package src.services;

import src.factories.FindPricingStrategyFactory;
import src.factories.FindSlotStrategyFactory;
import src.models.mobility.Vehicle;
import src.models.mobility.VehicleType;
import src.models.parking.FindSlotStrategy;
import src.models.parking.ParkingLot;
import src.models.parking.ParkingSlot;
import src.models.pricing.PricingStrategy;
import src.models.pricing.PricingStrategyType;
import src.models.tickets.Ticket;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;

public class ParkingLotService {
    private final ParkingLot parkingLot;
    private final FindSlotStrategy findSlotStrategy;
    HashMap<String,ParkingSlot> vehicleSlotMap;
    HashMap<String, Ticket>  vechicleTicketMap;

    public ParkingLotService(ParkingLot parkingLot,FindSlotStrategy findSlotStrategy) {
        this.parkingLot = parkingLot;
        this.findSlotStrategy = findSlotStrategy;
    }

    public void parkVehicle(Vehicle vehicle) {
        Optional<ParkingSlot> parkingSlot = findSlotStrategy.findParkingSlot(this.parkingLot,vehicle);
        if(!parkingSlot.isPresent()){
            System.out.println("Parking is Full !!");
            return;
        }
        parkingSlot.get().setVehicle(Optional.of(vehicle));
        vehicleSlotMap.put(vehicle.getRegistrationNo(),parkingSlot.get());
        System.out.println("Vehicle parked at slot");
        parkingSlot.get().display();


//        create a Ticket
        Ticket ticket = new Ticket(System.currentTimeMillis(),parkingSlot.get(),vehicle, parkingLot.getPricingStrategies());
        vechicleTicketMap.put(vehicle.getRegistrationNo(),ticket);
        System.out.println("Ticket Created");
        ticket.display();
    }

    public void leaveParking(Vehicle vehicle) {
        ParkingSlot parkingSlot = vehicleSlotMap.get(vehicle.getRegistrationNo());

        if(parkingSlot == null){
            System.out.println("Vehicle not found in parking");
            return;
        }

        parkingSlot.removeVehicle();
        vehicleSlotMap.remove(vehicle.getRegistrationNo());

//        pay before leaving

        Ticket ticket = vechicleTicketMap.get(vehicle.getRegistrationNo());
        ticket.setExitTime(Optional.of(System.currentTimeMillis()));
        vechicleTicketMap.remove(vehicle.getRegistrationNo());

        ticket.calculateAndPay();

        System.out.println("Vehicle leaved at slot");
    }
}
