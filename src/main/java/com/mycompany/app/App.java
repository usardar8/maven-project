package com.mycompany.app;

/**
 * Hello everyone!
 */
public class App
{

    private final String message = "Hello everyone!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
