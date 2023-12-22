package org.example;

public class Application {
    public static void main(String[] args) {
        User myUser = new User();
        myUser.getFirstName();
        myUser.getLastName();
        myUser.getMiddleName();
        myUser.getNickname();
        myUser.getLogin();

        Dispatcher service = new Dispatcher();
        service.invoke();
    }
}