package cpe200;

import java.nio.file.attribute.UserPrincipalNotFoundException;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String UserName=null;
    private String Password=null;

    public User()
    {

    }

    public User(String name,String password)
    {
        this.setUserName(name);
        this.setPassword(password);
    }

    @Override
    public String getUserName() {
        return this.UserName;
    }

    @Override
    public String getPassword() {
        return this.Password;
    }

    @Override
    public String setUserName(String name)throws RuntimeException {
        if(name==null)
        {
            return null;
        }
        else if(name.matches("^[a-zA-Z][a-zA-Z0-9]{7,}$"))
        {
            String temp=UserName;
            this.UserName = name;
            return temp;
        }
        else
        {
            throw new RuntimeException("ERROR Invalid username");
        }
    }

    @Override
    public int setPassword(String name)throws RuntimeException {
        if(name.equals(""))
        {
            throw new RuntimeException("ERROR");
        }
        if(name.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}$"))
        {
            this.Password=name;
            return Password.length();
        }
        else
        {
            throw new RuntimeException("ERROR Invalid password");
        }
    }
}
