package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private  String userName;
    private String password;
    public User() {
        userName = null;
        password = null;
    }

    public User(String userName, String password) {
        setPassword(password);
        setUserName(userName);
        this.userName = userName;
        this.password = password;
    }

    public String setUserName(String name) {
        String temp="^[a-zA-Z][a-zA-Z0-9]{7,}$";
        if(isNull(name)) return "";
        if(name.matches(temp))
        {
            String name2 = userName;
            userName = name;
            return name2;
        }
        else  throw new RuntimeException();
    }

    public int setPassword(String name) {
        String temp="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-1])[A-Za-z0-9]{12,}$";
        if(isNull(name)) return 0;
        if(name.matches(temp))
        {
            password = name;
            return name.length();
        }
        else throw new RuntimeException();
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    public boolean isNull(String str)
    {
        if(str != null && str.length()>0)
            return false;
        return true;
    }
}
