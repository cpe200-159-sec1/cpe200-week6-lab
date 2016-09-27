package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String username;
    private String password;

    public User() {
        username = null;
        password = null;
    }

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
        if (!(u == (null))) {
            if (u.matches(x)) {
                String tmp = username;
                username = u;
                return tmp;

            } else throw new RuntimeException("ERROR");
        }

        return null;
    }

    @Override
    public int setPassword(String p) {
        String x = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}";
        if (!(p == (null))) {
            if (p.matches(x)) {
                password = p;
                return password.length();
            } else throw new RuntimeException("ERROR");
        }

        return 0;
    }
}
