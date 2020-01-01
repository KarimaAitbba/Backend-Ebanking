package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Compte;
import com.example.demo.services.CompteService;

@RestController
@RequestMapping(value = "/api/compte")
@CrossOrigin
public class CompteController {
	
	 @Autowired
	 CompteService compteService;
	 
	 @RequestMapping(value="/save",method = RequestMethod.POST)
	    public Compte saveCompte(@RequestBody Compte compte) {
	        return compteService.saveCompte(compte);
	    }
	 
	 @RequestMapping(value="/{id}",method = RequestMethod.GET)
	    public Compte getCompte(@PathVariable long id) {
	        return compteService.getCompte(id);
	    }
	 
	 @RequestMapping(value="/all",method = RequestMethod.GET)
	    public List<Compte> getCompte() {
	        return compteService.getComptes();
	    }
	 
	 @RequestMapping(value="/update",method = RequestMethod.PUT)
     public Compte updateCompte(@RequestBody  Compte compte) {
         return  compteService.updateComptet(compte);
    }
	 
	  @RequestMapping(value="/delete/{id}")
	    public void deleteCompte(@PathVariable long id) {
		  compteService.deleteCompte(id);
	    }
	  
	  @RequestMapping(value="/Prelement/{id}",method = RequestMethod.PUT)

		public boolean retirer(@PathVariable Long id) {
			return compteService.Prelement(id);
		}
	 

}

