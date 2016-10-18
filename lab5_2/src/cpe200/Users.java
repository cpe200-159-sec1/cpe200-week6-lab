package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<IUser> userList;

    public Users()
    {
        userList=new ArrayList<>();
    }
    public void addUser(IUser user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        User tmp=new User(userName,password);
        this.addUser(tmp);
    }

    public void deleteUser(IUser user)throws RuntimeException
    {
        if(!this.exists(user))
        {
            throw new RuntimeException("ERROR");
        }
        for (int i=0;i<userList.size();i++)
        {
            if(userList.get(i).equals(user))
            {
                userList.remove(i);
            }
        }
    }

    public boolean exists(IUser user)
    {
        for(int i=0;i<userList.size();i++)
        {
            if(userList.get(i)==user)
            {
                return true;
            }
        }
        return false;
    }

    public boolean usernameExists(String username)
    {
        for(int i=0;i<userList.size();i++)
        {
            if(userList.get(i).getUserName()==username)
            {
                return true;
            }
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public IUser getUserByUsername(String userName)
    {
        for (int i=0;i<userList.size();i++)
        {
            if(userList.get(i).getUserName().equals(userName))
            {
                return userList.get(i);
            }
        }
        return null;
    }

    public int count()
    {
        return userList.size();
    }

    public IUser[] getUserArray()
    {
        return userList.toArray(new User[0]);
    }
}
