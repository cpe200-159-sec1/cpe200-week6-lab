package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String userName;
    private String password;

    public User() {
    }
    public User(String user,String password) {
        setUserName(user);
        setPassword(password);
    }

    public String setUserName(String name) {
        if (name == null) return "";
        String tmp = this.getUserName();
        String rx = "[A-Za-z][0-9A-Za-z]{7,}";
        if (name.matches(rx))
        {
            this.userName = name;
            return tmp;
        }
        else
        {
            throw new RuntimeException();
        }
    }

    public int setPassword(String name) {
        if (name == null) return 0;
        String rx = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}";
        if (name.matches(rx))
        {
            this.password = name;
            return name.length();
        }
        else throw new RuntimeException();
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }
}
