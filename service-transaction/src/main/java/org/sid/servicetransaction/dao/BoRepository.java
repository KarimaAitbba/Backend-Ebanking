package org.sid.servicetransaction.dao;

import org.sid.servicetransaction.entities.Bo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BoRepository extends JpaRepository<Bo, Long>{

}
