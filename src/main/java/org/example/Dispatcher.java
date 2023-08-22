package org.example;

public class Dispatcher {
    public void invoke() {
        ConsoleUtils console = new ConsoleUtils();
        String nickname = console.getInput("Введите ник игрока: ");
        String login = console.getInput("Введите логин игрока: ");

        System.out.println("Ник игрока: " + nickname);
        System.out.println("Логин игрока: " + login);
    }
}
