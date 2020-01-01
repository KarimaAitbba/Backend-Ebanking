package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repositories.OffreRepository;
import com.example.demo.entities.Abonne;
import com.example.demo.entities.Compte;
import com.example.demo.entities.Offre;
import com.example.demo.services.AbonneService;
import com.example.demo.services.OffreService;


@RestController
@RequestMapping(value = "/api/offre")
@CrossOrigin
public class OffreController {
	
	 @Autowired
	 OffreService offreService;
	 
	 @RequestMapping(value="/save",method = RequestMethod.POST)
	    public Offre saveCompte(@RequestBody Offre offre) {
	        return offreService.saveOffre(offre);
	    }
	 
	    @RequestMapping(value="/update",method = RequestMethod.PUT)
	    public Offre updateOffre(@RequestBody  Offre offre) {
	        return  offreService.updateAgence(offre);

	    }
	
	 @RequestMapping(value="/{id}",method = RequestMethod.GET)
	    public Offre getOffre(@PathVariable long id) {
	        return offreService.getOffre(id);
	    }
	 @RequestMapping(value="/all",method = RequestMethod.GET)
	    public List<Offre> getOffres() {
	        return offreService.getOffres();
	    }
	 
	  @RequestMapping(value="/activateEtat/{id}")
	    public void activateEtatOffre(@PathVariable long id) {
		  offreService.activateEtatOffre(id);
	    }
	  @RequestMapping(value="/desaactivateEtat/{id}")
	    public void desaactivateEtatOffre(@PathVariable long id) {
		  offreService.desaactivateEtatOffre(id);
	    }
	  
	  @RequestMapping(value="/activatchoix/{id}")
	    public void Choix(@PathVariable long id) {
		  offreService.Choix(id);
	    }
	  @RequestMapping(value="/desaactivatchoix/{id}")
	    public void desactivateChoix(@PathVariable long id) {
		  offreService.desactiveChoix(id);
	    }
}
