package User;

public class User {
    String id;
    String name;
    UserVsBalanceSheet balanceSheet;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.balanceSheet = new UserVsBalanceSheet();
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public UserVsBalanceSheet getBalanceSheet() {
        return balanceSheet;
    }
}
