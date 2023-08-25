/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Date;

/**
 *
 * @author ucr
 */
public class UserSystem extends Person{
    
    private String password;
    private String nickName;

    public UserSystem(String password, String nickName) {
        this.password = password;
        this.nickName = nickName;
    }

    public UserSystem(String password, String nickName, char gender, Date birthday, String id, String name, Contact contac) {
        super(gender, birthday, id, name, contac);
        this.password = password;
        this.nickName = nickName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the nickName
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * @param nickName the nickName to set
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "UserSystem{" + "password=" + password + ", nickName=" +
                nickName + super.toString()+ '}';
    }

   
    
}
