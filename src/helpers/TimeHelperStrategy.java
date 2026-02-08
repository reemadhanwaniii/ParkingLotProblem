package src.helpers;

public class TimeHelperStrategy {
    public long convertTimeToHours(long milliseconds) {
        return  (milliseconds / 3600000);
    }
}
