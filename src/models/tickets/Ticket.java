package src.models.tickets;

import src.models.mobility.Vehicle;
import src.models.parking.ParkingSlot;
import src.models.payments.PaymentStrategy;
import src.models.pricing.PricingStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class Ticket {
    private String id;
    private Long entryTime;
    private Optional<Long> exitTime;
    private ParkingSlot parkingSlot;
    private Vehicle vehicle;
    private List<PricingStrategy> pricingStrategies;
    private Optional<PaymentStrategy> paymentStrategy;


    public Ticket(Long entryTime,ParkingSlot parkingSlot,Vehicle vehicle,List<PricingStrategy> pricingStrategies) {
        this.entryTime = entryTime;
        this.parkingSlot = parkingSlot;
        this.vehicle = vehicle;
        this.id = UUID.randomUUID().toString();
        this.pricingStrategies = pricingStrategies;
        this.paymentStrategy = Optional.empty();
    }

    public void setExitTime(Optional<Long> exitTime) {
        this.exitTime = exitTime;
    }

    public void setPaymentStrategy(Optional<PaymentStrategy> paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public String getId() {
        return id;
    }

    public Long getEntryTime() {
        return entryTime;
    }

    public Optional<Long> getExitTime() {
        return exitTime;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public List<PricingStrategy> getPricingStrategies() {
        return pricingStrategies;
    }

    public Optional<PaymentStrategy> getPaymentStrategy() {
        return paymentStrategy;
    }

    public void calculateAndPay() {

    }
    public void display(){
        System.out.println("ID: " + id);
        System.out.println("EntryTime: " + entryTime);
        System.out.println("ParkingSlot: " + parkingSlot.getSlotNo());
        System.out.println("Registartion No of Vehicle : " + this.vehicle.getRegistrationNo());
    }
}
