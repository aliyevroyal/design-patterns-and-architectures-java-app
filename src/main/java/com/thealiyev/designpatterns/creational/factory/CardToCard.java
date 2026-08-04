package com.thealiyev.designpatterns.creational.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CardToCard implements IPaymentMethod {
    public static final Logger LOGGER = LoggerFactory.getLogger(CardToCard.class);

    @Override
    public boolean pay() {
        return this.payWithCash();
    }

    private boolean payWithCash() {
        LOGGER.info("Payment was successful! Transferred from credit to card!");
        return true;
    }
}
