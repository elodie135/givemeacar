package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*primary class*/
@Entity

public class Agence {
    /*Propriete primary key*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//incrémentation id (+1)
    /*uml*/
    private Long Id;
    private boolean isHeadQuarter;
    private String city;
    private int stock;
    private String staff;
    private String adress;

    /**
     * @return Long return the Id
     */
    public Long getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * @return boolean return the IsHeadQuarter
     */
    public boolean isIsHeadQuarter() {
        return isHeadQuarter;
    }

    /**
     * @param isHeadQuarter the IsHeadQuarter to set
     */
    public void setIsHeadQuarter(boolean isHeadQuarter) {
        this.isHeadQuarter = isHeadQuarter;
    }

    /**
     * @return String return the City
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the City to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return int return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return String return the staff
     */
    public String getStaff() {
        return staff;
    }

    /**
     * @param staff the staff to set
     */
    public void setStaff(String staff) {
        this.staff = staff;
    }

    /**
     * @return String return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

}
