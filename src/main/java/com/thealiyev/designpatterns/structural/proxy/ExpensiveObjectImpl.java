package com.thealiyev.designpatterns.structural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExpensiveObjectImpl implements ExpensiveObject {
    private final static Logger LOGGER = LoggerFactory.getLogger(ExpensiveObjectImpl.class);

    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        LOGGER.info("Processing is completed!");
    }

    private void heavyInitialConfiguration() {
        LOGGER.info("Loading Initial Configuration...");
    }
}
