package com.service.administration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.administration.models.Compte;


public interface CompteRepository extends JpaRepository<Compte, Long>{

}
