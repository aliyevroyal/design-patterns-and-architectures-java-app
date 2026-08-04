package com.thealiyev.designprinciples.solid.ocp.paymentsystem;

public class CashPayment implements IPaymentPreference {
    @Override
    public String makePayment() {
        return "Paid with the cash!";
    }
}
