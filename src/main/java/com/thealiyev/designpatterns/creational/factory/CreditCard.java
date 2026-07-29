package com.thealiyev.designpatterns.creational.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreditCard implements IPayment {
    private static final Logger LOGGER = LoggerFactory.getLogger(CreditCard.class);

    @Override
    public boolean pay() {
        return this.payWithCreditCard();
    }

    private boolean payWithCreditCard() {
        LOGGER.info("Payment was successful! Paid with credit card!");
        return true;
    }
}
