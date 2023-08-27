package org.example;

import java.time.LocalDateTime;

public abstract class Person {
    private final LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updateAt = LocalDateTime.now();
}
