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
public class Costumer extends Person{
    
    private double discount;
    private int idCostumer;

    public Costumer(double discount, int idCostumer) {
        this.discount = discount;
        this.idCostumer = idCostumer;
    }

    public Costumer(double discount, int idCostumer,
            char gender, Date birthday,
            String id, String name, Contact contac) {
        super(gender, birthday, id, name, contac);
        this.discount = discount;
        this.idCostumer = idCostumer;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the idCostumer
     */
    public int getIdCostumer() {
        return idCostumer;
    }

    /**
     * @param idCostumer the idCostumer to set
     */
    public void setIdCostumer(int idCostumer) {
        this.idCostumer = idCostumer;
    }

    @Override
    public String toString() {
        return "Costumer{" + "discount=" + discount + ", idCostumer=" +
                idCostumer + super.toString()+'}';
    }

   
    
    
    
    
}
