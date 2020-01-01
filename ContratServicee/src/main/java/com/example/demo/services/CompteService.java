package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Compte;;

public interface CompteService{
	public Compte saveCompte(Compte compte);
    public  Compte getCompte(long id);
    public  Compte updateComptet(Compte compte);
    public  void deleteCompte(long id);
    public  List<Compte> getComptes();
    public boolean Prelement(Long id);

}
