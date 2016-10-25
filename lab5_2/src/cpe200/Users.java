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
        IUser inputUser = new User();
        inputUser.setUserName(userName);
        inputUser.setPassword(password);
        userList.add(inputUser);

    }

    public void deleteUser(IUser user)
    {

        if(!userList.remove(user)) {
            throw new RuntimeException();

        }
    }


    public boolean exists(IUser user)
    {

        return userList.contains(user);
    }

    public boolean usernameExists(String username)
    {
        for(IUser findUser :  userList){
            if(findUser.getUserName().equals(username)){
                return  true;
            }
        }

        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public IUser getUserByUsername(String userName)
    {
        for(IUser findUser :  userList){
            if(findUser.getUserName().equals(userName)){
                return  findUser;
            }
        }
        return null;
    }

    public int count()
    {
        return  userList.size();
    }

    public IUser[] getUserArray()
    {
        IUser[] usertoArray = new IUser[userList.size()];
        usertoArray = userList.toArray(usertoArray);

        return usertoArray;

    }
}
