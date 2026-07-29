package com.thealiyev.designpatterns.creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Singleton {
    private static final Logger LOGGER = LoggerFactory.getLogger(Singleton.class);

    private Singleton() {
        LOGGER.info("Instance is created!");
    }

    private static class SingletonInner {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInner.INSTANCE;
    }

    public static void log() {
        LOGGER.info("This log was stored by Singleton class!");
    }
}
