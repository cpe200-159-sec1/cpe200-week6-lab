package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String userName;
    private String password;

    public User() {
        setUserName("");
        setPassword("");
    }

    @Override
    public String getUserName() {
        return this.userName;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String setUserName(String u) {
        String A = "[a-zA-Z][A-Za-z0-9]{7,}";
        String oldname = null;
        if ( u != null && !u.equals("")) {
            if (u.matches(A)) {
                oldname = userName;
                userName = u;
            } else {
                throw new RuntimeException("false");
            }
        }
        return oldname;
    }

    @Override
    public int setPassword(String p) {
        String B = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}";
        if ( p != null && !p.equals("")) {
            if (p.matches(B)) {
                password = p;
            } else
                throw new RuntimeException("false");
        }
        return p.length();
    }
}
