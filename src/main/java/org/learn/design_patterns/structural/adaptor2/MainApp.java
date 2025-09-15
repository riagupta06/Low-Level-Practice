package org.learn.design_patterns.structural.adaptor2;

public class MainApp {

    public static void main(String[] args) {

        Payment payment = new PaymentAdaptor(new StripePayment());
        payment.pay(1500);

        Payment payment1 = new PayPalPayment();
        payment1.pay(1500);

    }

}
