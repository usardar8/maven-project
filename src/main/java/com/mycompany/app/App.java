package com.mycompany.app;

/**
 * Hello world with lots of love to everyone!
 */
public class App
{

    private final String message = " Hello world with lots of love to everyone!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
