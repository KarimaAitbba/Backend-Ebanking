package com.service.administration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.administration.models.Compte;
import com.service.administration.models.Contrat;
import com.service.administration.services.CompteServiceI;
import com.service.administration.services.ContratServiceI;

@RestController
@RequestMapping(value = "/admin")
@CrossOrigin
public class CompteApi {
	
	@Autowired
    private CompteServiceI compteService;
	
    @RequestMapping(value="/comptes",method = RequestMethod.GET)
    public List<Compte> getChargeClientels() {
        return compteService.getComptes();
    }


}
