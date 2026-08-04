package com.thealiyev.designpatterns.creational.factory;

import com.thealiyev.designpatterns.creational.factory.enums.PaymentMethod;

public class PaymentFactory {
    public IPaymentMethod createPaymentObject(String paymentMethod) {
        if (paymentMethod.equals(PaymentMethod.CARD.getValue())) {
            return new CreditCard();
        } else if (paymentMethod.equals(PaymentMethod.CARD_TO_CARD.getValue())) {
            return new CardToCard();
        } else {
            //default credit card
            return new CreditCard();
        }
    }
}
