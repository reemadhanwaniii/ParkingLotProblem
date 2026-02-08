package src.factories;

import src.config.ServerConfig;
import src.models.pricing.HourlyPricingStrategy;
import src.models.pricing.PricingStrategy;
import src.models.tickets.Ticket;

public class FindPricingStrategyFactory {
    public static PricingStrategy createPricingStrategy(Ticket ticket) {
        return
                new HourlyPricingStrategy(
                        ServerConfig.PRICE_PER_HOUR,
                        ticket.getExitTime().get() - ticket.getEntryTime()
                );
    }
}
