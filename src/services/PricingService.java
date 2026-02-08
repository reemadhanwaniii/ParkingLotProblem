package src.services;

import src.factories.FindPricingStrategyFactory;
import src.models.pricing.PricingStrategy;
import src.models.pricing.PricingStrategyType;
import src.models.tickets.Ticket;

public class PricingService {
    public static long calculatePricingCharge(Ticket ticket){
        for (PricingStrategy strategy : ticket.getPricingStrategies()) {
            if(strategy.getType().equals(PricingStrategyType.HOURLY)) {
                strategy = FindPricingStrategyFactory.createPricingStrategy(ticket);
            }
        }

        return ticket.getPricingStrategies().stream().mapToLong(PricingStrategy::calculatePrice).sum();
    }
}
