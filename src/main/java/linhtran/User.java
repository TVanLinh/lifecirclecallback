package linhtran;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by linhtran on 23/04/2017.
 */
public class User implements InitializingBean,DisposableBean{
    private String userName;
    private String passWord;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
      //  System.out.println("bean inited !");
    }

    @Override
    public void destroy() throws Exception {
     //   System.out.println("bean destroy!");
    }



}
