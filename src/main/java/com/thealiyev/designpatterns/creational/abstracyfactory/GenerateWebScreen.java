package com.thealiyev.designpatterns.creational.abstracyfactory;

public class GenerateWebScreen implements GenerateScreen {
    @Override
    public IPage createPage() {
        return new WebPage();
    }

    @Override
    public IComponent createComponent() {
        return new WebComponent();
    }
}
