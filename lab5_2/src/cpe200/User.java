package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String userName;
    private String password;

    public User(){
    }

    public User(String userName,String  password){
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String getUserName() {
        return this.userName;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String setUserName(String u) {
        String test1 = "[A-Za-z][\\w\\d]{7,}";
        if(u == null) return null;
        if(u.matches(test1)){
            String user = this.userName;
            this.userName = u;
            return  user;
        }
        throw new RuntimeException("invalid name is assigned");
    }

    @Override
    public int setPassword(String p) {
        String test2 = "(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d])[\\w\\d]{12,}";
        if (p.matches(test2)) {
            int pass = p.length();
            this.password = p;
            return pass;
        }
        return -1;
    }
}
