package com.service.administration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.administration.models.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long>{

}
