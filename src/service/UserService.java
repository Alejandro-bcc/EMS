package src.service;

import src.dao.UserDAO;
import src.model.User;
import src.session.Session;
import src.service.PasswordHasher;
import java.util.regex.Pattern;

public class UserService implements IUserService {
    // Attributes
    private UserDAO dao;

    // Constructor
    public UserService() {
        this.dao = new UserDAO();
    }

    // Methods
    public boolean register(String username, String email, String rawPassword) {
        if (username == null || email == null)
            return false;

        String userRegex = "^[a-zA-Z0-9_-]{4,20}$";
        String emailRegex = "^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9.\\-]+\\.[a-zA-Z]{2,}$";

        if (!Pattern.matches(userRegex, username) ||
                !Pattern.matches(emailRegex, email) ||
                this.dao.existsByUsername(username) ||
                this.dao.existsByEmail(email)) {
            return false;
        }
        if (rawPassword == null || rawPassword.length() < 6)
            return false;

        String hash = PasswordHasher.hashPassword(rawPassword);
        this.dao.add(new User(username, email, hash));
        return true;
    }

    public boolean remove(String username) {
        if (!this.dao.existsByUsername(username))
            return false;
        return this.dao.remove(username);
    }

    public boolean login(String username, String rawPassword) {
        User u = this.dao.findByUsername(username);
        if (u != null && PasswordHasher.verifyPassword(rawPassword, u.getPasswordHash())) {
            Session.getInstance().login(u);
            return true;
        }
        return false;
    }

    public void logout() {
        Session.getInstance().logout();
    }
}
