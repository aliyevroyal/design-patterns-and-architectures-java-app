package com.thealiyev.designpatterns.creational.abstracyfactory;

public interface GenerateScreen {
    IPage createPage();

    IComponent createComponent();
}
