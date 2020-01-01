package com.service.administration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.OpPlus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.service.administration.models.Operation;
import com.service.administration.services.OperationServiceI;

@RestController
@RequestMapping(value = "/admin")
@CrossOrigin
public class OperationApi {
	
    @Autowired
    private OperationServiceI operationService;
	
    @RequestMapping(value="/operations",method = RequestMethod.GET)
    public List<Operation> getAgences() {
        return operationService.getOperations();
    }

}
