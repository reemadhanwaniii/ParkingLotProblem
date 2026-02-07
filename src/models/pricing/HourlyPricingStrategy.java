package src.models.pricing;

public class HourlyPricingStrategy implements PricingStrategy {

    private final long pricePerHour;
    private long noOfHours;

    public HourlyPricingStrategy(long pricePerHour,long noOfHours) {
        this.pricePerHour = pricePerHour;
        this.noOfHours = noOfHours;
    }

    @Override
    public long calculatePrice() {
        return pricePerHour * noOfHours;
    }

    public void setNoOfHours(long noOfHours) {
        this.noOfHours = noOfHours;
    }

    @Override
    public PricingStrategyType getType() {
        return PricingStrategyType.HOURLY;
    }
}
