package com.example.examan_mobile.model;

public class parc {
    String nom;
    String description;
    String Cordonnées_map[];
    String image_parc;

    public parc(String nom, String description, String[] cordonnées_map, String image_parc) {
        this.nom = nom;
        this.description = description;
        Cordonnées_map = cordonnées_map;
        this.image_parc = image_parc;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getCordonnées_map() {
        return Cordonnées_map;
    }

    public void setCordonnées_map(String[] cordonnées_map) {
        Cordonnées_map = cordonnées_map;
    }

    public String getImage_parc() {
        return image_parc;
    }

    public void setImage_parc(String image_parc) {
        this.image_parc = image_parc;
    }
}
