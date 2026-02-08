package src.factories;

import src.models.parking.FindSlotStrategy;
import src.models.parking.LinearSearchFindingStrategy;

public class FindSlotStrategyFactory {
    public static FindSlotStrategy createFindSlotStrategy() {
        return new LinearSearchFindingStrategy();
    }
}
