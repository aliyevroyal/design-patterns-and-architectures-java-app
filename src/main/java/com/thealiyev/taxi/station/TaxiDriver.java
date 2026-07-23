package com.thealiyev.taxi.station;

import java.time.LocalDate;
import java.time.Period;

public class TaxiDriver {
    public String fullName;
    public LocalDate birthday;

    public Period getBirthday() {
        return Period.between(birthday, LocalDate.now());
    }
}
