package com.example.demo.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Abonne;
import com.example.demo.entities.Bo;
import com.example.demo.entities.Contrat;

public interface ContratRepository extends JpaRepository<Contrat, Long>{
	
List<Contrat> findContratByBo(Bo bo);

}
