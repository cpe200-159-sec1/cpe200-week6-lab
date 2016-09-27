package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String userName;
    private String password;

    public User() {
    }
    public User(String name, String password){
        this.setUserName(name);
        this.setPassword(password);
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
        String regx = "^[A-Za-z][A-Za-z0-9]{7,}$";
        if (u != null){
            if (!u.matches(regx)){
                throw new RuntimeException("Name is invalid.");
            }
            try {
                String exName = this.userName;
                this.userName = u;
                return exName;
            }catch (RuntimeException ex){
                System.out.println(ex.getMessage());
            }catch (Exception ex){
                System.out.println("It's time to say GoodBye.");
            }
        }

        return null;
    }

    @Override
    public int setPassword(String p) {
        String regx = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}$";
        if (!p.matches(regx) || "".equals(p)){
            throw new RuntimeException("Password is invalid.");
        }
        try {
            this.password = p;
            return this.password.length();
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            System.out.println("It's time to say GoodBye.");
        }
        return 0;
    }
}
