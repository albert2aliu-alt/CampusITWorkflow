package edu.university.campus.domain;

public abstract class User {

    private final int id;
    private String name;
    private String email;

    public User(int id, String name, String email) {
        if (id <= 0) {
            throw new IllegalArgumentException("User ID must be positive.");
        }

        this.id = id;
        setName(name);
        setEmail(email);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isBlank() || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address.");
        }

        this.email = email;

    }
    public abstract void processRequest();
}
