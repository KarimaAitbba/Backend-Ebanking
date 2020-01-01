package com.example.demo.services;

import java.util.Date;
import java.util.List;

import javax.persistence.Convert;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.CompteRepository;
import com.example.demo.Repositories.ContratRepository;
import com.example.demo.entities.Compte;

@Service
public class CompteServiceImp implements CompteService{
	@Autowired
    CompteRepository compteRepository;
	
	@Override
	public Compte saveCompte(Compte compte) {
		return compteRepository.save(compte);
	}

	@Override
	public Compte getCompte(long id) {
		return compteRepository.getOne(id);
	}

	@Override
	public Compte updateComptet(Compte compte) {
		return compteRepository.save(compte);
	}

	@Override
	public void deleteCompte(long id) {
		compteRepository.deleteById(id);
		
	}

	@Override
	public List<Compte> getComptes() {
		return compteRepository.findAll();
	}
	
	@Override
	@Transactional
	public boolean Prelement(Long id) {
		Compte c = getCompte(id);
		Date datecreation= c.getDateCreation();
		Date d = new Date();
		long p = d.getTime()-datecreation.getTime();
		if (p>356  && ( c.getSolde()<30000))
			
		{
			 c.setSolde(c.getSolde()-c.getSolde()*0.1);
				return true;

		}
		else 
			if (p>356  && ( c.getSolde()>30000 && c.getSolde() <70000 ))
				
			{
				 c.setSolde(c.getSolde()-c.getSolde()*0.2);
					return true;

			}
		else 
				if (p>356  && ( c.getSolde()>70000 ))
					
				{
					 c.setSolde(c.getSolde()-c.getSolde()*0.5);
						return true;

				}
		
			
				return false;
	}



}
