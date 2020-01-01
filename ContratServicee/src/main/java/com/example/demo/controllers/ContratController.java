package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Contrat;
import com.example.demo.services.ContratService;

@RestController
@RequestMapping(value = "/api/contrat")
@CrossOrigin
public class ContratController {
	
	@Autowired
	ContratService 	contratService;
	
	@RequestMapping(value="/save" ,method = RequestMethod.POST)
    public Contrat saveContrat(@RequestBody Contrat contrat) {
        return contratService.saveContrat(contrat);
    }
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Contrat getChargeClientel(@PathVariable long id) {
        return contratService.getContrat(id);
    }
    @RequestMapping(value="/all",method = RequestMethod.GET)
    public List<Contrat> getContrats() {
        return contratService.getContrats();
    }
 
    @RequestMapping(value="/update",method = RequestMethod.PUT)
    public Contrat updateContrat(@RequestBody  Contrat contrat) {
        return  contratService.updateContrat(contrat);

    }
    @RequestMapping(value="/delete/{id}")
    public void deleteContrat(@PathVariable long id) {
        contratService.deleteContrat(id);
    }
    @RequestMapping(value="allcontratByBO/{id}",method = RequestMethod.GET)
    public List<Contrat> getallcontratbyabonne(@PathVariable long id) {
        return contratService.getallcontrats(id);
    }


}
