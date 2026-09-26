package com.thealiyev.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {
    private Integer id;
    private String name;

    private List<Department> departments;

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.departments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        for (int counter = 0; counter < departments.size(); counter = counter + 1) {
            departments.get(counter).printDepartmentName();
        }
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }
}
