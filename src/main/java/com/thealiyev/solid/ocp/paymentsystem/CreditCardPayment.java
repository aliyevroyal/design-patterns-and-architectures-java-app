package com.thealiyev.solid.ocp.paymentsystem;

public class CreditCardPayment implements IPaymentPreference {
    @Override
    public String makePayment() {
        return "Paid with the credit card!";
    }
}
