package com.api.vehicules.service;

import com.api.vehicules.model.Marque;
import com.api.vehicules.repository.Marque_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Marque_service { 
    @Autowired
    private Marque_repository marque_repository;
    public List<Marque> getAllMarque(){
        return marque_repository.findAll();
    }
}

