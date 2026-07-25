package com.thealiyev.ocp.paymentsystem;

public class PaymentSystem {
    private IPaymentPreference iPaymentPreference;

    public PaymentSystem(IPaymentPreference iPaymentPreference) {
        this.iPaymentPreference = iPaymentPreference;
    }

    public void MakePayment() {
        iPaymentPreference.makePayment();
    }
}
