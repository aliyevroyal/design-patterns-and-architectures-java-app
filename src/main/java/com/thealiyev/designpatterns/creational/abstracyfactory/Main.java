package com.thealiyev.designpatterns.creational.abstracyfactory;

public class Main {
    public static void main(String[] args) {
        GenerateScreen screenGenerator = new GenerateWebScreen();

        IComponent webComponent = screenGenerator.createComponent();
        webComponent.buildComponent();

        IPage webPage = screenGenerator.createPage();
        webPage.buildPage();
    }
}
