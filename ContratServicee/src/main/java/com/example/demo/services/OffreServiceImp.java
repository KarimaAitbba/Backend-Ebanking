package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.AbonneRepository;
import com.example.demo.Repositories.OffreRepository;
import com.example.demo.entities.Abonne;
import com.example.demo.entities.Offre;

@Service
public class OffreServiceImp implements OffreService{
	
	@Autowired
    OffreRepository offreRepository;
	
	

	@Override
	public Offre getOffre(long id) {
		return offreRepository.getOne(id);
	}

	@Override
	public List<Offre> getOffres() {
		return offreRepository.findAll();
	}

	@Override
	public void activateEtatOffre(long id) {
		Offre offre=getOffre(id);
		offre.setEtatOffre(true);
		offreRepository.save(offre);
		
	}

	@Override
	public void Choix(long id) {
		Offre offre=getOffre(id);
		offre.setChoisi(true);
		offreRepository.save(offre);
		
	}

	@Override
	public void desaactivateEtatOffre(long id) {
		Offre offre=getOffre(id);
		offre.setEtatOffre(false);
		offreRepository.save(offre);
	}

	@Override
	public void desactiveChoix(long id) {
		Offre offre=getOffre(id);
		offre.setEtatOffre(true);
		offreRepository.save(offre);
		
	}

	@Override
	public Offre saveOffre(Offre offre) {
		return offreRepository.save(offre);
	}

	@Override
	public Offre updateAgence(Offre offre) {
		// TODO Auto-generated method stub
		return offreRepository.save(offre);
	}

}
