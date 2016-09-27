package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    public String userName;
    public String password;
    public User(String username,String password){
        this.userName = username;
        this.password = password;
    }


    public User(){

    }

    public String setUserName(String name) {
        if (name != null) {
            if ((name.length() >= 8) && (name.matches("^([A-Za-z])([A-Za-z0-9]+)$"))) {
                String temp = userName;
                userName = name;

                return temp;

            } else
                throw new RuntimeException();

        }return null;
    }

    public int setPassword(String name) {
        if((name.length() >=12)&&(name.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]+)$"))){
            password =name;

            return password.length();
        } else
            throw new RuntimeException();
    }

    public String getUserName() {

        return  userName;
    }

    public String getPassword() {

        return password;
    }

}
