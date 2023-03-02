package com.example.examan_mobile.model;

public class surface {
    String nom;
    String description;
    String Cordonnées_map[];
    String image_surface;

    public surface(String nom, String description, String[] cordonnées_map, String image_surface) {
        this.nom = nom;
        this.description = description;
        Cordonnées_map = cordonnées_map;
        this.image_surface = image_surface;
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

    public String getImage_surface() {
        return image_surface;
    }

    public void setImage_surface(String image_surface) {
        this.image_surface = image_surface;
    }
}
