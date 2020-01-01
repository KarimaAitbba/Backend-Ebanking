package org.sid.servicetransaction.dao;

import java.util.List;

import org.sid.servicetransaction.entities.Abonne;
import org.sid.servicetransaction.entities.Beneficiare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BeneficiareRepository extends JpaRepository<Beneficiare, Long>{

  List<Beneficiare> findByAbonne(Abonne a);
}
