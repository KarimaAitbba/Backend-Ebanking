package org.sid.service_compte.services;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.apache.commons.collections.map.MultiValueMap;
import org.apache.http.HttpEntity;
import org.sid.service_compte.clients.GetAbonneeClient;
import org.sid.service_compte.dao.AbonneRepository;
import org.sid.service_compte.dao.CarteBancaireRepository;
import org.sid.service_compte.dao.CompteRepository;
import org.sid.service_compte.dao.ContratRepository;
import org.sid.service_compte.dao.OperationRepository;
import org.sid.service_compte.entities.Abonne;
import org.sid.service_compte.entities.CarteBancaire;
import org.sid.service_compte.entities.Compte;
import org.sid.service_compte.entities.Contrat;
import org.sid.service_compte.entities.Operation;
import org.sid.service_compte.entities.Virement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;



@Service
public class CompteService {
	@Autowired
	CompteRepository compteRepository;
	@Autowired
	AbonneRepository abonneRepository;
	@Autowired
	OperationRepository operationRepository;
	@Autowired
	CarteBancaireRepository carteBancaireRepository;
	@Autowired
	ContratRepository  contratRepository;

	@Autowired
	public GetAbonneeClient getAbonnee; 
	
	
	public Abonne insertAbonne(Abonne a) {
		Contrat c  = a.getContrat();
		c.setObjectif("Kariappmmpmmmmmpppp");
		contratRepository.save(c);
		return abonneRepository.save(a);
	}
	
	
	public Compte getCompte(long id) {
		return compteRepository.getOne(id);
	}

	public Operation getOperation(long id) {
		return operationRepository.getOne(id);
	}
	
	
	public CarteBancaire getCarteBancaire(Long id) {
		return carteBancaireRepository.getOne(id);
	}
	
	//Changé
	public List<Compte> findAllAccountsAbonne(long id)
	{
		Contrat contrat = contratRepository.getOne(id);
		return compteRepository.findByContrat(contrat);
    }
	
	
	public List<Compte> findAllAccounts()
	{
		return compteRepository.findAll();
    }
	
	//Changé
	public List<Virement> findAllOperations(Long idCompte)
	{
		Compte compte = compteRepository.getOne(idCompte);
		return compte.getVirements();
	}
	
	
	public CarteBancaire findAllCarteBancaire(Long idCompte)
	{
		Compte compte = compteRepository.getOne(idCompte);
		return  compte.getCarteBancaire();
	}
	
	
	public void DesactiveEtatCarte(Long idCarte)
	{
		CarteBancaire carte = carteBancaireRepository.getOne(idCarte);
		
		 carte.setEtat("desactiver");
		
		 carteBancaireRepository.save(carte);
			
			
	}
	public void ActiveEtatCarte(Long idCarte)
	{
		CarteBancaire carte = carteBancaireRepository.getOne(idCarte);
		
		 carte.setEtat("active");
		
		 carteBancaireRepository.save(carte);
			
			
	}
	
}
