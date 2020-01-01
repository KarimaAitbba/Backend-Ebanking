package com.service.administration.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.administration.models.Compte;
import com.service.administration.repository.CompteRepository;

@Service
public class ConpteService implements CompteServiceI{
	
	@Autowired
	CompteRepository compteRepository;
	

	@Override
	public List<Compte> getComptes() {
		// TODO Auto-generated method stub
		return compteRepository.findAll();
	}

}
