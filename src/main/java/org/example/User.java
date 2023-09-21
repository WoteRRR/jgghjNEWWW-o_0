package org.example;

class User extends Person {
    private String nickname;
    private String login;
    private String firstName;
    private String lastName;
    private String middleName;

    @Override
    public String toString() {
        return "User{" +
                "nickname='" + nickname + '\'' +
                ", login='" + login + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }

    public User(String nickname, String login, String firstName, String lastName, String middleName) {
        this.nickname = nickname;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;

    }
}
