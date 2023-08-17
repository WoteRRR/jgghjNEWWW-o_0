package org.example;

public class Application {
    public static void main(String[] args) {
        ConsoleUtils console = new ConsoleUtils();
        String nickname = console.getInput("Введите ник игрока: ");
        String login = console.getInput("Введите логин игрока: ");

        System.out.println("Ник игрока: " + nickname);
        System.out.println("Логин игрока: " + login);
    }
}