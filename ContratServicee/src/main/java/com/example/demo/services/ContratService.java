package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Contrat;

public interface ContratService {
	
    public Contrat saveContrat(Contrat contrat);
    //public  Contrat getContrat(Long id);
    public  Contrat updateContrat(Contrat contrat);
    //public  void deleteContrat(Long id);
    public  List<Contrat> getContrats();
    public List<Contrat> getallcontrats(long id);
	public Contrat getContrat(long id);
	public void deleteContrat(long id);

}
