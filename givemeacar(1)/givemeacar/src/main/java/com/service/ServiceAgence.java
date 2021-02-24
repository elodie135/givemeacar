package com.service;

import com.model.Agence;
import com.model.Car;
import com.model.Client;
import com.model.Contract;

import org.springframework.stereotype.Service;

@Service
 
public interface ServiceAgence {
    /*
    // Permet l'ajout d'un agence avec parametre une agence 
    // @param agence
    // @return agence
    */
    Agence createAgence(Agence agence);
    /*
    // Permet l'ajout d'un car avec parametre un car
    // @param car
    // @return car
    */
    
    Car ajoutCar (Car car);
     /*
    // suppression d'un véhicule avec en parametre l'id du vehicule
    // @param clientId
    // @param carId
    // @param agenceId
    // @return car
    */
    Contract faireuncontrat (Client clientId, Integer flatRate, Car carId, Agence agenceId);
}
