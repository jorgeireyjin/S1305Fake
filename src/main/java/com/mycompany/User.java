package com.mycompany;

// Clase de usuario simple
public class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}