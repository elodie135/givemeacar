package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Car {
    /* Propriete primary key */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /* uml */
    private Long Id;/*attribut*/
    boolean isEmpty;
    String brand;
    String kilometers;
    String disponibility;

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
