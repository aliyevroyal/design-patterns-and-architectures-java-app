package com.thealiyev.designpatterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();

        IPayment iPayment = paymentFactory.createPaymentObject("Card");
        iPayment.pay();

        IPayment iPayment1 = paymentFactory.createPaymentObject("CardToCard");
        iPayment1.pay();
    }
}
