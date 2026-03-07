package src.repository;

import src.model.User;
import java.util.HashMap;

public class UserRepository {
    // Atributes
    private static UserRepository instance;
    private HashMap<String, User> users;
    
    // Constructor 
    private UserRepository(){
        this.users = new HashMap<String, User>();
    }

    // Methods 
    public static UserRepository getInstance(){
        if(instance == null){
            instance = new UserRepository();
        }
        return instance;
    }

    public HashMap<String, User> getUsers(){
        return this.users;
    }
}
