package com.thealiyev.dip.hotelsystem;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface ISupplier {
    public ArrayList<Hotel> callHotel(String city, LocalDateTime startDate, LocalDateTime endDate, int theNumberOfPeople);
}
