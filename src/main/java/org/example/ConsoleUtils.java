package org.example;

import java.util.Scanner;

public class ConsoleUtils {
    public String getInput(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
