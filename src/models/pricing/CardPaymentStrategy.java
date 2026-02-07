package src.models.pricing;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(float amount) {
        System.out.println("Paid using Cash : "+ amount);
    }
}
