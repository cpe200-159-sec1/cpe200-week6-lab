package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {

    private ArrayList<IUser> userList = new ArrayList<>();

    public void addUser(IUser user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        //incase of input is string, so we have to conv it to object first
        User newUser = new User();
        newUser.setUserName(userName);
        newUser.setPassword(password);
        userList.add(newUser);

    }

    public void deleteUser(IUser user)
    {
        //userList.remove(user);
        if(!userList.remove(user)) {
            throw new RuntimeException();
        }
    }

    public boolean exists(IUser user)
    {

        if (userList.contains(user)){
            return true;
        }

        return false;
    }

    public boolean usernameExists(String username)
    {
        for (IUser user : userList) {
            if (user.getUserName().equals(username))
                return true;
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public IUser getUserByUsername(String userName)
    {
        for (IUser user : userList) {
            if (user.getUserName().equals(userName))
                return user;
        }

        return null;
    }

    public int count()
    {
        return userList.size();
    }

    public IUser[] getUserArray()
    {

        return userList.toArray(new User[1]);
    }
}
