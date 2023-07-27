package org.example;

import java.util.Scanner;

public class playerInfo {
    public static void main(String[] args) {
        String playerName = getPlayerInput("Введите ник игрока: ");
        String playerLogin = getPlayerInput("Введите логин игрока: ");

        System.out.println("Ник игрока: " + playerName);
        System.out.println("Логин игрока: " + playerLogin);
    }

    public static String getPlayerInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }
}