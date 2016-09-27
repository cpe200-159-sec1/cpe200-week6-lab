package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    public String userName;
    public String password;

    public User(){

    }
    public User(String user ,String pass) {
        setUserName(user);
        setPassword(pass);
    }

    public String setUserName(String name) {
        if(name != null) {
            String tmp = userName;
            if (isUsernameValid(name)) {
                userName = name;
            } else {
                throw new RuntimeException();
            }
            return tmp;
        }return null;
    }

    public int setPassword(String name) {
        if (name != null) {
            if (isPasswordValid(name)) {
                password = name;
            } else {
                throw new RuntimeException();
            }
            return password.length();
        }return 0;
    }

    public String getUserName() {

        return userName;
    }

    public String getPassword(){
        return password;
    }


    public boolean isUsernameValid(String name) {
        if (name.length() < 8){//check lengh >=8
            return false;
        }else if (Character.isDigit(name.charAt(0)) == true) {
            return false;
        }else {
            for (int i = 0; i < name.length(); i++) {
                if (Character.isAlphabetic(name.charAt(i)) == false) {
                    if (Character.isDigit(name.charAt(i)) == false){
                        return false;
                    }
                }
            }
            return true;


        }
    }
    public boolean isPasswordValid(String name){
        if (name.length() >=12){
            boolean haveDigit=false,haveCapital=false,haveSmall=false;
            for (int i=0;i<name.length();i++)
            {
                if(Character.isUpperCase(name.charAt(i))) haveCapital=true;
                else if(Character.isLowerCase(name.charAt(i))) haveSmall=true;
                else if(Character.isDigit(name.charAt(i))) haveDigit=true;
                if(haveCapital && haveDigit && haveSmall){
                    password = name;
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
