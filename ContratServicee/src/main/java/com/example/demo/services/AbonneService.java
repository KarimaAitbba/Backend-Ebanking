package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Abonne;

public interface AbonneService {
	
	public Abonne saveAbonne(Abonne abonne);
	public Abonne getAbonne(long id);
	public Abonne updateAbonne(Abonne abonne);
	public  void deleteAbonne(long id);
	public  void activateAbonne(long id);
	public  void desactivateAbonne(long id);
	public List<Abonne> getAbonnes();

}
