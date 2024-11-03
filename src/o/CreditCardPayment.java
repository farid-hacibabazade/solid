package o;

public class CreditCardPayment implements PaymentMethod {

    private String cardNumber;

    @Override
    public void processPayment(double amount) {
        System.out.println(amount + "$ Credit card payment process is done");
    }
}
