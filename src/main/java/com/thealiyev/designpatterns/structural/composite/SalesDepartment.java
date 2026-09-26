package com.thealiyev.designpatterns.structural.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SalesDepartment implements Department {
    private static final Logger LOGGER = LoggerFactory.getLogger(SalesDepartment.class);

    private Integer id;
    private String name;

    public SalesDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printDepartmentName() {
        LOGGER.info("Department: " + getClass().getSimpleName());
    }
}
