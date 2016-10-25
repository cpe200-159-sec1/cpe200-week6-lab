package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String userName = null;
    private String password;

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String setUserName(String u) {
        if(u == null){
               return null;
        }else {
            String re = "^[A-Za-z][A-Za-z0-9]{7,}$";
            if (u.matches(re)) {
                String n = userName;
                userName = u;

                return n;
            } else throw new RuntimeException();
        }
    }

    @Override
    public int setPassword(String p) {
        if(p == null){
            return 0;
        }else {
            String re = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}$";
            if (p.matches(re)) {
                password = p;
                return p.length();
            } else throw new RuntimeException();
        }
    }
}
