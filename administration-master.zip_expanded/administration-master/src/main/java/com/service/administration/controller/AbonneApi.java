package com.service.administration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.administration.models.Abonne;

import com.service.administration.services.AbonneServiceI;


@RestController
@RequestMapping(value = "/admin")
@CrossOrigin
public class AbonneApi {
	
    @Autowired
    private AbonneServiceI abonneService;
	
    @RequestMapping(value="/abonnes",method = RequestMethod.GET)
    public List<Abonne> getAgences() {
        return abonneService.getAbonnes();
    }
}
