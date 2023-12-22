package org.example;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
class User extends Person {

    private String nickname;
    private String login;
    private String firstName;
    private String lastName;
    private String middleName;

}



