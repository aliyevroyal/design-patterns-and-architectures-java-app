package com.thealiyev.designpatterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();

        IPaymentMethod iPaymentMethod1 = paymentFactory.createPaymentObject("Card");
        iPaymentMethod1.pay();

        IPaymentMethod iPaymentMethod2 = paymentFactory.createPaymentObject("CardToCard");
        iPaymentMethod2.pay();
    }
}
