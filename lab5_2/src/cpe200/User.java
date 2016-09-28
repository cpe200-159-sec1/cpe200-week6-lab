package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    public String userName;
    public String password;

    public String userNameForm = "^[a-zA-Z][a-zA-Z0-9]{7,}$";
    public String passwordForm = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}$";

    public User() {
        userName = null;
        password = null;
    }

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
        if (u != null) {

            if (u.equals("") || !u.matches(userNameForm)) {

                throw new RuntimeException("username can't use or don't have username");
            }
            String UserName_Before = userName;
            userName = u;

            return UserName_Before;
        }
        return null;
    }


    @Override
    public int setPassword(String p) {
        if (p == null || p.equals("") || !p.matches(passwordForm)) {

            throw new RuntimeException("wrong password");
        }

        password = p;

        return p.length();
    }
}

