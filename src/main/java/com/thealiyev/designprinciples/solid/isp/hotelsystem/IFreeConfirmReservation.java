package com.thealiyev.designprinciples.solid.isp.hotelsystem;

public interface IFreeConfirmReservation {
    String getUsername();

    String getHotelInfo();

    void confirmReservation();
}
