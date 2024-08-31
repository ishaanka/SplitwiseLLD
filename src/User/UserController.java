package User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> users;

    public UserController() {
        users = new ArrayList<User>();
    }
    public void addUser(User user) {
        users.add(user);
    }
    public void removeUser(User user) {
        users.remove(user);
    }
    public User getUser(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }
    public List<User> getUsers() {
        return users;
    }
}
