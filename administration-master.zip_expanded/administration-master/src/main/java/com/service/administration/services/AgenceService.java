package com.service.administration.services;

import com.service.administration.models.Agence;
import com.service.administration.repository.AgenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgenceService implements AgenceServiceI{

    @Autowired
    AgenceRepository agenceRepository;
    @Override
    public Agence saveAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence getAgence(long id) {
        return agenceRepository.getOne(id);
    }

    @Override
    public List<Agence> getAgences() {
        return agenceRepository.findAll();
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void deleteAgence(long id) {
        agenceRepository.deleteById(id);
    }

	@Override
	public Long getNumberofAgence() {
		 return agenceRepository.count();
	}
}
