package com.thealiyev.designpatterns.creational.abstracyfactory;

public class GenerateWinFormScreen implements GenerateScreen {
    @Override
    public IPage createPage() {
        return new WinForm();
    }

    @Override
    public IComponent createComponent() {
        return new WinFormComponent();
    }
}
