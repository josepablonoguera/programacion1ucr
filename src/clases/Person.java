/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Date;

/**
 *
 * @author ucr
 * @see Contact
 */
public class Person {
     
    private char gender;    
    private Date birthday;        
    private String id;
    private String name;
    private Contact contac;
  
    /**
     * 
     */
    public Person() {
        this.gender = 'N';
        this.birthday = null;       
        this.id = "No definido";
        this.name = "NO definido";  // 
        this.contac = new Contact();
    } 
    

    public Person(char gender, Date birthday, 
            String id,
            String name, Contact contac) {
        this.gender = gender;
        this.birthday = birthday;      
        this.id = id;
        this.name = name;
        this.contac= contac;
       
    }
    
     public Person(char gender, String id, String name) {
        this.gender = gender;            
        this.id = id;
        this.name = name;
        
      
       
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * @return the birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the contac
     */
    public Contact getContac() {
        return contac;
    }

    /**
     * @param contac the contac to set
     */
    public void setContac(Contact contac) {
        this.contac = contac;
    }

    @Override
    public String toString() {
        return "Person{" + "gender=" + gender + ", birthday=" + birthday + 
                ", id=" + id + ", name=" + name + ", contac=" + contac.toString()
                + '}';
    }

   
    
    
}
