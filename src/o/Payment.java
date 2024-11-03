package o;

import o.PayPalPayment;

public class Payment {
    public static void main(String[] args) {

        PaymentMethod payment = new PayPalPayment();
//        PaymentMethod payment = new CreditCardPayment();
        payment.processPayment(300);


    }
}
