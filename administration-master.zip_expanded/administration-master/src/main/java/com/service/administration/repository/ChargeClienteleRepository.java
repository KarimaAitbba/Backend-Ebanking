package com.service.administration.repository;
import com.service.administration.models.Agence;
import com.service.administration.models.Bo;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface ChargeClienteleRepository extends JpaRepository<Bo,Long> {

	public Long countBoByAgence(Agence agence);
}
