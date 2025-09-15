package org.learn.design_patterns.structural.adaptor2;

public class PaymentAdaptor implements Payment {

    private final StripePayment stripePayment;

    PaymentAdaptor(StripePayment stripePayment) {
        this.stripePayment = stripePayment;
    }

    @Override
    public void pay(int amount) {
        stripePayment.pay(amount, "USD");
    }
}
