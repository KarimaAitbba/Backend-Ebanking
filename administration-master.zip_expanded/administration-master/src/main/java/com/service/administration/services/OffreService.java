package com.service.administration.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.administration.models.Offre;

import com.service.administration.repository.OffreRepository;

@Service
public class OffreService implements OffreServiceI{
	
	@Autowired
    OffreRepository offreRepository;

	@Override
	public List<Offre> getOffres() {
		return offreRepository.findAll();
	}
	

}
