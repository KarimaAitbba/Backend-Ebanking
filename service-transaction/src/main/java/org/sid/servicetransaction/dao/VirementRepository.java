package org.sid.servicetransaction.dao;

import java.util.List;

import org.sid.servicetransaction.entities.Compte;
import org.sid.servicetransaction.entities.Virement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VirementRepository  extends JpaRepository<Virement, Long> {
	List<Virement>  findByCompte(Compte compte);
	
	List<Virement>  findByType(String type_virement);
}
