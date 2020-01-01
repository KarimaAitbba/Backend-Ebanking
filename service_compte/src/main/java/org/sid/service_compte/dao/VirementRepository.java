package org.sid.service_compte.dao;

import java.util.List;

import org.sid.service_compte.entities.Compte;
import org.sid.service_compte.entities.Virement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VirementRepository  extends JpaRepository<Virement, Long> {
	List<Virement>  findByCompte(Compte compte);
}
