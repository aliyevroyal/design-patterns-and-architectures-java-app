package com.thealiyev.ocp.paymentsystem;

public class CashPayment implements IPaymentPreference {
    @Override
    public String makePayment() {
        return "Paid with the cash!";
    }
}
