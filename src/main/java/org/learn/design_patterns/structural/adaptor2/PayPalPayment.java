package org.learn.design_patterns.structural.adaptor2;

public class PayPalPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paypal payment");
    }
}
