package org.sid.servicetransaction.dao;

import java.util.List;

import org.sid.servicetransaction.entities.Compte;
import org.sid.servicetransaction.entities.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OperationRepository extends JpaRepository<Operation, Long>{

	//List<Operation> findByCompte(Compte compte);
}
