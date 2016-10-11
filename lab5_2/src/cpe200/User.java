package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String username;
    private String password;

    public User(){
    }

    public User(String user, String pwd) {
        setUserName(user);
        setPassword(pwd);
    }

    public boolean isNull(String s){
        if("".equals(s) || s == null){
            return true;
        }return false;
    }

    @Override
    public String getUserName() {
        return this.username;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String setUserName(String u) {
        if(isNull(u))return null;

        String rexUser = "^[a-zA-Z][A-Za-z0-9]{7,}$";
        String tmp = username;
        if(u.matches(rexUser) ) {
            this.username = u;
            return tmp;
        }throw new RuntimeException("Username Empty or Error");
    }

    @Override
    public int setPassword(String p) {
        if(isNull(p)) return 0;

        String rexPass ="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}$";
        if(p.matches(rexPass)){
            this.password = p;
            return password.length();
        }throw new RuntimeException("Password worng");
    }
}
