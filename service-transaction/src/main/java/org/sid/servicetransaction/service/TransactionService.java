package org.sid.servicetransaction.service;

import java.util.List;

import org.sid.servicetransaction.dao.CompteRepository;
import org.sid.servicetransaction.dao.VirementRepository;
import org.sid.servicetransaction.entities.Compte;
import org.sid.servicetransaction.entities.Virement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

	@Autowired
	VirementRepository virementRepository;
	@Autowired
	CompteRepository compteRepository;
	
	public List<Virement> listeVirements(){
		return virementRepository.findAll();
		
	}
	
	
	
	
public List<Virement> listeVirementsByCompte(Compte c){
		return virementRepository.findByCompte(c);
		
	}
	
	
	public List<Virement> listeVirementsByType(String type_virement){
		return virementRepository.findByType(type_virement);
		
	}
	
	public Virement virementById(long id){
		return virementRepository.getOne(id);
		
	}
	
	public Virement saveVirement(Virement v){
		Compte compteRetrait = v.getCompte_abonne();
		double montant = v.getMontant();
		String compteBeneficiare = v.getId_compte_beneficiare();
		compteRetrait.setSolde(compteRetrait.getSolde() - montant);
		compteRepository.save(compteRetrait);
		
		Compte compteBeneficiaree = compteRepository.getOne(Long.valueOf(compteBeneficiare));
		compteBeneficiaree.setSolde(compteBeneficiaree.getSolde() + montant);
		compteRepository.save(compteBeneficiaree);
		
		return virementRepository.save(v);
		
	}
	
	
	
	public Virement saveVirementBeneficiare(Virement v){
		Compte compteRetrait = v.getCompte_abonne();
		double montant = v.getMontant();
		compteRetrait.setSolde(compteRetrait.getSolde() - montant);
		compteRepository.save(compteRetrait);
		return virementRepository.save(v);
		
	}
	
	
	public void deleteVirement(Virement v){
		virementRepository.delete(v);
		
	}
}
