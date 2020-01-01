package com.service.administration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.service.administration.models.Abonne;



public interface AbonneRepository extends JpaRepository<Abonne, Long>{

}
