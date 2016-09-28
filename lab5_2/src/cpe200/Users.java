package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<IUser> userList = new ArrayList<>();

    public void addUser(IUser user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        userList.add(new User(userName,password));
    }

    public void deleteUser(IUser user)
    {
        if (!userList.remove(user))
            {
                    throw new RuntimeException();
            }
        else userList.remove(user);

    }

    public boolean exists(IUser user)
    {
        return userList.contains(user);
    }

    public boolean usernameExists(String username)
    {
        for (IUser i:userList)
        {
                if (i.getUserName().equals(username)) {
                return true;
            }
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public IUser getUserByUsername(String userName)
    {
        for (IUser i : userList)
            {
                    if (i.getUserName().equals(userName)) {
                return i;
            }
        }
        return null;
    }

    public int count()
    {
        int c=0;
        for(IUser i:userList)
        {
            c++;
        }
        return c;
    }

    public IUser[] getUserArray()
    {
        return userList.toArray(new User[userList.size()]);
    }
}
