package com.example.examan_mobile.model;

public class hotel {
    String nom;
    String description;
    String Cordonnées_map[];
    String image_hotel;

    public hotel(String nom, String description, String[] cordonnées_map, String image_hotel) {
        this.nom = nom;
        this.description = description;
        Cordonnées_map = cordonnées_map;
        this.image_hotel = image_hotel;
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

    public String getImage_hotel() {
        return image_hotel;
    }

    public void setImage_hotel(String image_hotel) {
        this.image_hotel = image_hotel;
    }
}
