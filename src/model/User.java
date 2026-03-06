package src.model;

public class User {
    // Attributes
    private String username = "";
    private String email = "";
    private String passwordHash = "";

    // Full Constructor
    public User(String username, String email, String passwordHash) {
        this.setUsername(username);
        this.setEmail(email);
        this.setPasswordHash(passwordHash);
    }

    // Getters
    public String getUsername() {
        return this.username;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPasswordHash() {
        return this.passwordHash;
    }

    // Setters
    public void setUsername(String username) {
        if (username != null && !username.isBlank()) {
            this.username = username;
        }
    }

    public void setEmail(String email) {
        if (email != null && !email.isBlank()) {
            this.email = email;
        }
    }

    public void setPasswordHash(String passwordHash) {
        if (passwordHash != null && !passwordHash.isBlank()) {
            this.passwordHash = passwordHash;
        }
    }

    // Methods
    @Override
    public String toString() {
        return String.format("username: %s, email: %s",
                this.getUsername(), this.getEmail());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof User))
            return false;
        return this.username.equals(((User) o).username);
    }

    @Override
    public int hashCode() {
        return this.username.hashCode();
    }
}