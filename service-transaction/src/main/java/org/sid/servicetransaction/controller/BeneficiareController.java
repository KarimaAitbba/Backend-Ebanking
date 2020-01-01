package org.sid.servicetransaction.controller;

import java.util.List;

import org.sid.servicetransaction.dao.AbonneRepository;
import org.sid.servicetransaction.dao.BeneficiareRepository;
import org.sid.servicetransaction.entities.Abonne;
import org.sid.servicetransaction.entities.Beneficiare;
import org.sid.servicetransaction.service.BeneficiareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/beneficiare")
@CrossOrigin
public class BeneficiareController {

	@Autowired
	BeneficiareService beneficiareService;
	
	@Autowired
	AbonneRepository abonneeRepository;
	
	
	@RequestMapping(value="/all",  method=RequestMethod.GET)
	public  List<Beneficiare> listBeneficiare(){
		
		return beneficiareService.listBeneficiare();
	}
	
	
	@RequestMapping(value="/allAbonne/{id}",  method=RequestMethod.GET)
	public  List<Beneficiare> listBeneficiareAbonne(@PathVariable long id){
		Abonne a = abonneeRepository.getOne(id);
		return beneficiareService.listBeneficiareByAbonne(a);
	}
	
	
	
	
	@RequestMapping(value="/save",  method=RequestMethod.POST)
	public  Beneficiare saveBeneficiare(@RequestBody Beneficiare b){
		return beneficiareService.saveBeneficiare(b);
	}
	
	
	
	@RequestMapping(value="/byId/{id}",  method=RequestMethod.GET)
	public  Beneficiare beneficiare(@PathVariable long id){
		
		return beneficiareService.getBeneficiare(id);
	}
	
	@RequestMapping(value="/delete/{id}",  method=RequestMethod.DELETE)
	public  void deleteBeneficiare(@PathVariable long id){
		beneficiareService.deleteBeneficiare(id);
	
	}
	
	
}
