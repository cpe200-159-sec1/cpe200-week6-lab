package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    public String userName;
    public String password;
    public String setUserName(String name) {
        if (name == null ){
            return null;
        }
        String checkName = new String("^[A-Za-z][0-9A-Za-z]{7,}$");
        if (name.matches(checkName) == true) {
            String oldname = this.userName;
            this.userName = name;
            return oldname;
        } else {
            throw new RuntimeException("Invalid name");
        }
    }

    public int setPassword(String name) {
        if (name == null && name.equals("")){
            return password.length();
        }
        String checkpassword = new String("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]{12,})$");
        if (name.matches(checkpassword) == true) {
            this.password = name;
            return password.length();

        } else {
            throw new RuntimeException("Invalid Password");
        }
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}



