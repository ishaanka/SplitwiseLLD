package Group;
import java.util.ArrayList;
import java.util.List;
import User.User;

public class Group {
    String name;
    List<User> userList;

    public Group(String name) {
        this.name = name;
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }
    public void removeUser(User user) {
        userList.remove(user);
    }
    public List<User> getUserList() {
        return userList;
    }
    public String getName() {
        return name;
    }
}
