package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String userName;
    private String password;

    public User() {
        setUserName("");
        setPassword("");

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
        String Oname = null;
        String a = "[a-zA-Z][A-Za-z0-9]{7,}";
        if(u != null && !u.equals("")){
            if(u.matches(a)){
                Oname = userName;
                userName = u;
            }else
                throw new RuntimeException("ERROR");
        }
        return Oname;
    }

    @Override
    public int setPassword(String p) {
        String b = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{12,}";
        if(p != null && !p.equals("")){
            if(p.matches(b)){
                password = p;
            }else
                throw new RuntimeException("ERROR");
        }
        return p.length();

    }
}

