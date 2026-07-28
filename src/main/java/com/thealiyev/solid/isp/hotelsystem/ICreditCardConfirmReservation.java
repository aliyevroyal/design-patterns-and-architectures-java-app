package com.thealiyev.solid.isp.hotelsystem;

public interface ICreditCardConfirmReservation extends IFreeConfirmReservation {
    String creditCardInfo();

    boolean payWithCreditCar();
}
