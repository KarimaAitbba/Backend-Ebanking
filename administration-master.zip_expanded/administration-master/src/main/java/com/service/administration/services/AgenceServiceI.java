package com.service.administration.services;

import com.service.administration.models.Agence;

import java.util.List;

public interface AgenceServiceI {

    public Agence saveAgence(Agence agence);
    public  Agence getAgence(long id);
    public List<Agence> getAgences();
    public  Agence updateAgence(Agence agence);
    public  void deleteAgence(long id);
    
    public  Long getNumberofAgence();

}
