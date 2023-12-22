package org.example;

import java.time.LocalDateTime;

public abstract class Person {
    protected final LocalDateTime createdAt = LocalDateTime.now();
    protected LocalDateTime updateAt = LocalDateTime.now();
}
