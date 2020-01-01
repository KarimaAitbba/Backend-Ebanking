package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.AbonneRepository;
import com.example.demo.Repositories.BoRepository;
import com.example.demo.Repositories.ContratRepository;
import com.example.demo.entities.Abonne;
import com.example.demo.entities.Bo;
import com.example.demo.entities.Contrat;

@Service
public class ContratServiceImp implements ContratService{
	@Autowired
    ContratRepository contratRepository;
	
	@Autowired
    BoRepository boRepository;
	
	@Override
	public Contrat saveContrat(Contrat contrat) {
		return contratRepository.save(contrat);
	}

	@Override
	public Contrat getContrat(long id) {
		return contratRepository.getOne(id);
	}

	@Override
	public Contrat updateContrat(Contrat contrat) {
		return contratRepository.save(contrat);
	}

	@Override
	public void deleteContrat(long id) {
		contratRepository.deleteById(id);
		
	}

	@Override
	public List<Contrat> getContrats() {
		return contratRepository.findAll();
	}

	@Override
	public List<Contrat> getallcontrats(long id) {
		Bo bo=boRepository.getOne(id);
		return contratRepository.findContratByBo(bo);
	}



}
