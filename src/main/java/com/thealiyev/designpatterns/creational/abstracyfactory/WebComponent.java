package com.thealiyev.designpatterns.creational.abstracyfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebComponent implements IComponent {
    private static final Logger LOGGER = LoggerFactory.getLogger(WebComponent.class);

    public void buildComponent() {
        LOGGER.info("Web Component 1 has been created!");
        LOGGER.info("Web Component 2 has been created!");
    }
}
