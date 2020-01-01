package com.service.administration.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.administration.models.Abonne;
import com.service.administration.repository.AbonneRepository;

@Service
public class AbonneService implements AbonneServiceI{
	
	@Autowired
    AbonneRepository abonneRepository;

	@Override
	public List<Abonne> getAbonnes() {
		return abonneRepository.findAll();
	
	}

}
