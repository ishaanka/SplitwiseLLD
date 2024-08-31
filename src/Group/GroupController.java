package Group;

import java.util.ArrayList;
import java.util.List;

public class GroupController {
    List<Group> groups;

    public GroupController() {
        groups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        groups.add(group);
    }
    public void removeGroup(Group group) {
        groups.remove(group);
    }
    public List<Group> getGroups() {
        return groups;
    }
    public Group getGroup(String name) {
        for (Group group : groups) {
            if (group.getName().equals(name)) {
                return group;
            }
        }
        return null;
    }
}
