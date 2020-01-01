package org.sid.servicetransaction.dao;

import java.util.List;

import org.sid.servicetransaction.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ContratRepository extends JpaRepository<Contrat, Long>{
	
}
