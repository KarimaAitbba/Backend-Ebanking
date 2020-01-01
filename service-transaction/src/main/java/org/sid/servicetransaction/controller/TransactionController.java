package org.sid.servicetransaction.controller;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.sid.servicetransaction.dao.CompteRepository;
import org.sid.servicetransaction.dao.VirementRepository;
import org.sid.servicetransaction.entities.Beneficiare;
import org.sid.servicetransaction.entities.Compte;
import org.sid.servicetransaction.entities.Virement;
import org.sid.servicetransaction.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;


@RestController
@RequestMapping("/api/transaction")
@CrossOrigin
public class TransactionController {

	@Autowired
	TransactionService transactionService;
	
	@Autowired
	CompteRepository compteRepository;
	

	@Autowired
	VirementRepository virementRepository;
	
	@RequestMapping(value="/all",  method=RequestMethod.GET)
	public  List<Virement> listVirements(){
		
		return transactionService.listeVirements();
	}
	
	

	@RequestMapping(value="/byCompte/{id}",  method=RequestMethod.GET)
	public  List<Virement> listVirementsByCompte(@PathVariable long id){
		
		return transactionService.listeVirementsByCompte(compteRepository.getOne(id));
	}
	
	@RequestMapping(value="/byType/{type}",  method=RequestMethod.GET)
	public  List<Virement> listVirementsByType(@PathVariable String type){
		
		return transactionService.listeVirementsByType(type);
	}
	
	@RequestMapping(value="/byId/{id}",  method=RequestMethod.GET)
	public  Virement virementById(@PathVariable long idVirement){
		
		return transactionService.virementById(idVirement);
	}
	
	
	
	@RequestMapping(value="/save",  method=RequestMethod.POST)
	public  Virement saveVirement(@RequestBody Virement virement){
		
		return transactionService.saveVirement(virement);
	}
	
	
	@RequestMapping(value="/saveVirementBeneficiare",  method=RequestMethod.POST)
	public  Virement saveVirementBeneficiare(@RequestBody Virement virement){
		
		return transactionService.saveVirementBeneficiare(virement);
	}
	
	
	@RequestMapping(value="/saveCompte",  method=RequestMethod.POST)
	public  Compte saveCompte(@RequestBody Compte compte){
		
		return compteRepository.save(compte);
	}
	
	
	
	
	
	@RequestMapping(value="/delete/{id}",  method=RequestMethod.DELETE)
	public  void deleteVirement(@PathVariable long idVirement){
		 transactionService.deleteVirement(virementRepository.getOne(idVirement));
	}
	

	
}
