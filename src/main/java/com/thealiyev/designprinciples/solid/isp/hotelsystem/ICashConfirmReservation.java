package com.thealiyev.designprinciples.solid.isp.hotelsystem;

public interface ICashConfirmReservation extends IFreeConfirmReservation {
    int cashierInfo();

    boolean payWithTheMoneyFromCashier();
}
