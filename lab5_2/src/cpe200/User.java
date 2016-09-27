package cpe200;

import java.util.ArrayList;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String userName;
    private String password;
    ArrayList<String> user = new ArrayList<String>();
    public int count=0;


    public User() {

    }

    public String setUserName(String name) {
        if(name == null){
            return null;
        }
        String correct="^[a-zA-Z][a-zA-Z0-9]{7,}$";
        if(count==0 && name.matches(correct)){
            userName = name;
            user.add(userName);
            count++;
            return null;
        }
        else if(name.matches(correct)) {
            userName = name;
            user.add(userName);
            count++;
            return user.get(count - 2);
        }
        throw new RuntimeException();
    }

    public int setPassword(String name) {
        String correct="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-1])[A-Za-z0-9]{12,}$";
        if(name.matches(correct))
        {
            password = name;
            return password.length();
        }
        throw new RuntimeException();
    }

    public String getUserName() { return this.userName; }

    public String getPassword() {
        return this.password;
    }
}
