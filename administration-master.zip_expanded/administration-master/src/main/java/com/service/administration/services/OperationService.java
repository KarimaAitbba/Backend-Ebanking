package com.service.administration.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.administration.models.Operation;
import com.service.administration.repository.OperationRepository;

@Service
public class OperationService implements OperationServiceI {
	
	@Autowired
    OperationRepository perationRepository;

	@Override
	public List<Operation> getOperations() {
		return perationRepository.findAll();
	}

}
