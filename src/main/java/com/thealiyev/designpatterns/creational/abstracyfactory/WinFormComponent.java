package com.thealiyev.designpatterns.creational.abstracyfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WinFormComponent implements IComponent {
    private static final Logger LOGGER = LoggerFactory.getLogger(WinFormComponent.class);

    public void buildComponent() {
        LOGGER.info("Win form component 1 has been created!");
        LOGGER.info("Win form component 2 has been created!");
    }
}
