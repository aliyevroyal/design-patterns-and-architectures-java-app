package com.thealiyev.designpatterns.creational.factory.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentMethod {
    CARD("Card"), CARD_TO_CARD("CardToCard");

    private final String value;
}