package org.sid.service_compte.dao;

import java.util.List;

import org.sid.service_compte.entities.Abonne;
import org.sid.service_compte.entities.Compte;
import org.sid.service_compte.entities.Contrat;
import org.sid.service_compte.entities.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte, Long>{
	
	//le probleme est que dans compte faut avoir un attribut contrat dans le nom est le meme que la classe
	
	List<Compte> findByContrat(Contrat contrat_compte);
	
	/* List<Compte> findByAbonne(Abonne abonne);
	 Compte findByIdCompte(long idCompte);*/
}
