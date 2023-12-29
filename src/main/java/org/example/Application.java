package org.example;

public class Application {
    public static void main(String[] args) {
        Dispatcher service = new Dispatcher();
        service.invoke();
    }
}