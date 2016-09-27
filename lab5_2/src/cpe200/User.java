package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String username;
    private String password;

    @Override
    public String getUserName() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String setUserName(String u) {
        String x = "[A-Za-z][A-Za-z0-9]{7,}";
        if (u.matches(x) && !(u.equals(null))) {
            String tmp = username;
            username = u;
            return tmp;
        }
        throw new RuntimeException("Error");
    }

    @Override
    public int setPassword(String p) {
        String x = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}";
        if (p.matches(x) && !(p.equals(null))) {
            password = p;
            return password.length();
        }
        throw new RuntimeException("Error");
    }
}
