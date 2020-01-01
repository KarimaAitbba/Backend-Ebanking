package com.service.administration.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.administration.models.Contrat;
import com.service.administration.repository.ContratRepository;

@Service
public class ContratService implements ContratServiceI{
	
	@Autowired
    ContratRepository contratRepository;

	@Override
	public List<Contrat> getContrats() {
		// TODO Auto-generated method stub
		return contratRepository.findAll();
	}

}
