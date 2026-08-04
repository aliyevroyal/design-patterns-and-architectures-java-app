package com.thealiyev.designprinciples.solid.dip.hotelsystem;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Supplier2 implements ISupplier {
    @Override
    public ArrayList<Hotel> callHotel(String city, LocalDateTime startDate, LocalDateTime endDate, int theNumberOfPeople) {
        //some requests and responses from/to server
        return new ArrayList<>();
    }
}
