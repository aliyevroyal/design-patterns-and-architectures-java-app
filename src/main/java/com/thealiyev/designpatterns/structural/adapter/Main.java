package com.thealiyev.designpatterns.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("Facade Design Pattern Main class starts working!");

        PayPalService payPalService = new PayPalService();
        PaymentProcessor paymentProcessor = new PayPalAdapter(payPalService);
        PaymentService paymentService = new PaymentService(paymentProcessor);
        paymentService.makePayment(100);
    }
}
