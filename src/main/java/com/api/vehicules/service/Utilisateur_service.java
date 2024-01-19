package com.api.vehicules.service;

import com.api.vehicules.model.Utilisateur;
import com.api.vehicules.repository.Utilisateur_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Utilisateur_service {
    @Autowired
    private Utilisateur_repository utilisateur_repository;

    public Utilisateur createUtilisateur(Utilisateur utilisateur){
        Utilisateur createUser = utilisateur_repository.save(utilisateur);
        return createUser;
    }

    public boolean loginUtilisateur(String email, String mdp){
        List<Utilisateur> source = utilisateur_repository.findAll();
        boolean valiny = false;
        for(int i = 0; i<source.size(); i++){
            if(source.get(i).getEmail().equals(email) && source.get(i).getMdp().equals(mdp)){
                valiny = true;
            }
        }
        return valiny;
    }

}
