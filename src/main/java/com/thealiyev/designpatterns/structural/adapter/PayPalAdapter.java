package com.thealiyev.designpatterns.structural.adapter;

public class PayPalAdapter implements PaymentProcessor {
    private final PayPalService payPalService;

    public PayPalAdapter(PayPalService payPalService) {
        this.payPalService = payPalService;
    }

    @Override
    public void pay(double amount) {
        payPalService.makePayment(amount);
    }
}
