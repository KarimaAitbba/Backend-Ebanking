package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Abonne;

import com.example.demo.services.AbonneService;

@RestController
@RequestMapping(value = "/api/abonne")
@CrossOrigin
public class AbonneController {
	
	 @Autowired
	 AbonneService abonneService;
	 
	
	 @RequestMapping(value="/save",method = RequestMethod.POST)
	    public Abonne saveAbonne(@RequestBody Abonne abonne) {
	        return abonneService.saveAbonne(abonne);
	    }
	 @RequestMapping(value="/{id}",method = RequestMethod.GET)
	    public Abonne getAbonne(@PathVariable long id) {
	        return abonneService.getAbonne(id);
	    }
	 
	 @RequestMapping(value="/all",method = RequestMethod.GET) 
	 public List<Abonne> getAbonnes() { 
	  return abonneService.getAbonnes(); 
	  }
      
	/*
	 * @RequestMapping(value="/all",method = RequestMethod.GET) public Response
	 * getAbonnes() { List<Abonne> abn=abonneService.getAbonnes(); return new
	 * Response("record counts : " + abn.size(), Boolean.TRUE); }
	 */
	 @RequestMapping(value="/update",method = RequestMethod.PUT)
	    public Abonne updateAbonnet(@RequestBody  Abonne abonne) {
	        return  abonneService.updateAbonne(abonne);

	    }
	    @RequestMapping(value="/activate/{id}")
	    public void activateAbonne(@PathVariable long id) {
	        abonneService.activateAbonne(id);
	    }
	    @RequestMapping(value="/desactivate/{id}")
	    public void desactivateAbonne(@PathVariable long id) {
	        abonneService.desactivateAbonne(id);
	    }
	    @RequestMapping(value="/delete/{id}")
	    public void deleteAbonne(@PathVariable long id) {
	        abonneService.deleteAbonne(id);
	    }
}
