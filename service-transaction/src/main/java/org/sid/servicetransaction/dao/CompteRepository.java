package org.sid.servicetransaction.dao;

import java.util.List;

import org.sid.servicetransaction.entities.Compte;
import org.sid.servicetransaction.entities.Contrat;
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
