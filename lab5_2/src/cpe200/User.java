package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String userName;
    private String password;

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String setUserName(String u) {
        String a = "[A-Za-z][A-Za-z0-9]{7,}";
        if (u != null && !u.equals("")) {
            if (u.matches(a)) {
                String x = userName;
                this.userName = u;
                return x;
            } else {
                throw new RuntimeException();
            }
        }else {
            return null;
        }
    }

    @Override
    public int setPassword(String p) {
        String a = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}";
        if (p != null && !p.equals("")) {
            if (p.matches(a)) {
                this.password = p;
                return password.length();
            }
        }else {
            throw new RuntimeException();
        }
        return 0;
    }
}
