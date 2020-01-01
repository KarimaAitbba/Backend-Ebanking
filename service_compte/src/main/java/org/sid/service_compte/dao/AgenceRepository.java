package org.sid.service_compte.dao;

import org.sid.service_compte.entities.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface AgenceRepository extends JpaRepository<Agence, Long>{

}
