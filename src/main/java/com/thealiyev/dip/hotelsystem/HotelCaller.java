package com.thealiyev.dip.hotelsystem;

import java.util.ArrayList;

public class HotelCaller {
    private ArrayList<ISupplier> suppliers;
    private ArrayList<Hotel> hotels;

    public HotelCaller(ArrayList<ISupplier> suppliers) {
        this.suppliers = suppliers;
    }

    public ArrayList<Hotel> callTheHotels() {
        hotels = new ArrayList<>();
        //does the job here to list and sort the hotels...
        return hotels;
    }
}
