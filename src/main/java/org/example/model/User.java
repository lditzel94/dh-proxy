package org.example.model;

import java.util.UUID;

public class User {
    private UUID id;
    private UserType type;

    public User( UUID id, UserType type ) {
        this.id = id;
        this.type = type;
    }

    public UUID getId() {
        return id;
    }

    public UserType getType() {
        return type;
    }

    public void setType( UserType type ) {
        this.type = type;
    }
}
