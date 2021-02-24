package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Contract {
    /* Propriete primary key */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /* uml */
    private Long Id;
    int id;
    String agence;
    String client;
    String date;
    Integer flatRate;

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

}
