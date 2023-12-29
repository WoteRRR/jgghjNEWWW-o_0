package org.example;

public class Dispatcher {
    public void invoke() {
        ConsoleUtils console = new ConsoleUtils();
        String nickname = console.getInput("Введите ник игрока: ");
        String login = console.getInput("Введите логин игрока: ");
        String firstName = console.getInput("Введите имя игрока: ");
        String lastName = console.getInput("Введите фамилию игрока: ");
        String middleName = console.getInput("Введите отчество игрока: ");

        User user = new User(nickname, login, firstName, lastName, middleName);
        System.out.println(user.toString());

        User myUser = new User();
        myUser.getFirstName();
        myUser.getLastName();
        myUser.getMiddleName();
        myUser.getNickname();
        myUser.getLogin();
    }
}