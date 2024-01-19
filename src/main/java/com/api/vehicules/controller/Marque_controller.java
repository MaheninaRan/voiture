package com.api.vehicules.controller;

import com.api.vehicules.model.Marque;
import com.api.vehicules.service.Marque_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/vehicule/")
@CrossOrigin
public class Marque_controller {
    @Autowired
    Marque_service marque_service;

    @GetMapping("all_marque")
    public List<Marque> getListMarque(){
        return marque_service.getAllMarque();
    }
}