package org.sid.servicetransaction.dao;

import org.sid.servicetransaction.entities.Abonne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@RepositoryRestResource
public interface AbonneRepository extends JpaRepository<Abonne, Long>{
	
}
