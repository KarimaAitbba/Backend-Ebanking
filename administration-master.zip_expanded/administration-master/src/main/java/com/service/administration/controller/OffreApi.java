package com.service.administration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.administration.models.Abonne;
import com.service.administration.models.Offre;
import com.service.administration.services.OffreServiceI;

@RestController
@RequestMapping(value = "/admin")
@CrossOrigin
public class OffreApi {
	
    @Autowired
    private OffreServiceI compteService;
	
    @RequestMapping(value="/offres",method = RequestMethod.GET)
    public List<Offre> getAgences() {
        return compteService.getOffres();
    }

}
