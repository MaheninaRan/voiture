package com.api.vehicules.model;

import jakarta.persistence.*;

@Entity
@Table(name = "marque")
public class Marque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_marque")
    int id_marque;
    @Column(name = "nom_marque")
    String nom_marque;

    public Marque() {
    }

    public Marque(int id_marque, String nom_marque) {
        this.id_marque = id_marque;
        this.nom_marque = nom_marque;
    }

    public int getId_marque() {
        return id_marque;
    }

    public void setId_marque(int id_marque) {
        this.id_marque = id_marque;
    }

    public String getNom_marque() {
        return nom_marque;
    }

    public void setNom_marque(String nom_marque) {
        this.nom_marque = nom_marque;
    }
}
