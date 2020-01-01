package com.example.demo.services;

import java.util.List;


import com.example.demo.entities.Offre;


public interface OffreService {
	public Offre saveOffre(Offre offre);
	public Offre getOffre(long id);
	public List<Offre> getOffres();
	public  void activateEtatOffre(long id);
	public  void Choix(long id);
	
	public  void desaactivateEtatOffre(long id);
	public  void desactiveChoix(long id);
	
	
	public  Offre updateAgence(Offre offre);
}
