package com.myJavaapp.Classes;

public class Habitation {
    String nom;
    Double longueur;
    Double largeur;

    public Habitation(){}
    public Habitation(String nom,Double largeur,Double longueur){
        this.nom = nom;
        this.longueur=longueur;
        this.largeur=largeur;
    }

    public Double surface(){
        return longueur * largeur;
    }

    public void afficherSurface(){
       System.out.println(this.nom + " a une surface de " + this.surface() + "m2");

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getLongueur() {
        return longueur;
    }

    public void setLongueur(Double longueur) {
        this.longueur = longueur;
    }

    public Double getLargeur() {
        return largeur;
    }

    public void setLargeur(Double largeur) {
        this.largeur = largeur;
    }
}
