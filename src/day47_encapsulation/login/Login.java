package day47_encapsulation.login;

public class Login {
    private String userName;
    private String password;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        }
    }

    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }
}
