package com.thealiyev.designpatterns.creational.abstracyfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WinForm implements IPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(WinForm.class);

    public void buildPage() {
        LOGGER.info("Win form has been created!");
    }
}
