package src.service;

public interface IUserService {

    public abstract boolean register(String username, String email, String rawPassword);
    public abstract boolean remove(String username);
    public abstract boolean login(String username, String rawPassword);
    public abstract void logout();
}
