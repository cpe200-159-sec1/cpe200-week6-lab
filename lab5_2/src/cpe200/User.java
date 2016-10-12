package cpe200;

public class User implements IUser {
    private String userName;
    private String password;
    public User() {

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
        if(u == null){
            return null;
        }
        String uName = userName;
        String checkName = "^[a-zA-Z][a-zA-Z0-9]{7,}$";
        if(u.matches(checkName)){
            userName = u;
        }
        else
            throw new RuntimeException("Error");
        return uName;
    }

    @Override
    public int setPassword(String p) {
        String checkPassword = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}$";
        if(p.matches(checkPassword)){
            password = p;
        }
        else {
            throw new RuntimeException("Error");
        }
        return p.length();
    }
}