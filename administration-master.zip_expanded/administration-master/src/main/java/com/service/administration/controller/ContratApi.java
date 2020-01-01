package com.service.administration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.administration.models.Bo;
import com.service.administration.models.Contrat;
import com.service.administration.services.AgenceServiceI;
import com.service.administration.services.ChargeClienteleService;
import com.service.administration.services.ContratServiceI;


@RestController
@RequestMapping(value = "/admin")
@CrossOrigin
public class ContratApi {
	
    
    @Autowired
    private ContratServiceI contrtaService;
	
    @RequestMapping(value="/contrats",method = RequestMethod.GET)
    public List<Contrat> getChargeClientels() {
        return contrtaService.getContrats();
    }

}
