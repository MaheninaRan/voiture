package com.api.vehicules.controller;

import com.api.vehicules.model.Utilisateur;
import com.api.vehicules.service.Utilisateur_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class Utilisateur_controller {
    @Autowired
    private Utilisateur_service utilisateur_service;

    @PostMapping("/add_user")
    public ResponseEntity<Utilisateur> createUser(@RequestBody Utilisateur utilisateur){
        Utilisateur create_user = utilisateur_service.createUtilisateur(utilisateur);
        return new ResponseEntity<>(create_user, HttpStatus.CREATED);
    }

    @GetMapping("/login")
    public ResponseEntity<Boolean> loginUtilisateur(
            @RequestParam String email,
            @RequestParam String mdp) {
        try {
            boolean login = utilisateur_service.loginUtilisateur(email, mdp);
            return ResponseEntity.ok(login);
        } catch (Exception e){
            e.printStackTrace(); // Ajoutez cela pour voir les erreurs dans les journaux
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(false);
        }
    }

}
