package cpe200;


import com.sun.org.apache.bcel.internal.generic.IUSHR;
import org.omg.CORBA.UShortSeqHelper;

import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    private ArrayList<IUser> userList;

    public Users(){
        userList = new ArrayList<IUser>();
    }


    public void addUser(IUser user){
        userList.add(user);
    }

    public void addUser(String userName, String password){
        User nUser = new User(userName, password);
        userList.add(nUser);
    }

    public void deleteUser(IUser user){
        if (count() > 0){
            userList.remove(user);
        }else {
            throw new RuntimeException("Removed");
        }
    }

    public boolean exists(IUser user){
        return userList.contains(user);
    }

    public boolean usernameExists(String username){
        if (isUserEmpty(username)){
            for (IUser user : userList){
                if (user.getUserName().equals(username)){
                    return true;
                }
            }
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public IUser getUserByUsername(String userName){
        if (isUserEmpty(userName)){
            for (IUser user : userList){
                if (user.getUserName().equals(userName)){
                    return user;
                }
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
        return userList.toArray(new User[count()]);
    }

    public boolean isUserEmpty(String e) {
        return (e != null && !e.equals(""));
    }
}
