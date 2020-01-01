package com.service.administration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.administration.models.Compte;
import com.service.administration.models.Offre;

public interface OffreRepository extends JpaRepository<Offre, Long>{

}
