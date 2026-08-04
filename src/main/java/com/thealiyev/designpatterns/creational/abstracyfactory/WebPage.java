package com.thealiyev.designpatterns.creational.abstracyfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebPage implements IPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(WebPage.class);

    public void buildPage() {
        LOGGER.info("Webpage has been created!");
    }
}
