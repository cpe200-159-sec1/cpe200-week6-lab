package cpe200;

import java.security.SecureRandom;

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
    public String setUserName(String user) {
        String tmp = "[A-Za-z][A-Za-z0-9]{7,}";
        if (user == null){
            return null;
        }
        if (user.matches(tmp)){
            String name = this.username;
            this.username = user;
            return name;
        }
        throw new RuntimeException("invalid name is assigned");
    }

    @Override
    public int setPassword(String pass) {
        String tmp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}$";
        if (pass == null){
            return 0;
        }
        if (pass.matches(tmp)){
            int password = pass.length();
            this.password = pass;
            return password;
        }
        return 0;
    }
}
