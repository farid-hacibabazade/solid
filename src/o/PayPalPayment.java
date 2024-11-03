package o;

public class PayPalPayment implements PaymentMethod{

    private String payPalAddress;

    @Override
    public void processPayment(double amount) {
        System.out.println(amount + "$ PayPal payment process is done");
    }

}
