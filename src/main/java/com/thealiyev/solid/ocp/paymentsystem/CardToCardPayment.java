package com.thealiyev.solid.ocp.paymentsystem;

public class CardToCardPayment implements IPaymentPreference {
    @Override
    public String makePayment() {
        return "Made the card to card payment!";
    }
}
