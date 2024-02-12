package com.myJavaapp.Classes;

public class Vehicule {

    private String nom;
    private int nbrRoue;
    private int vitesse;

    public Vehicule(){}
    public Vehicule(String nom,int nbrRoue,int vitesse){
        this.nom = nom;
        this.nbrRoue = nbrRoue;
        this.vitesse = vitesse;
    }
    public String getNom() {
        return nom;
    }

    public void boost(){
        this.vitesse += 50;
    }

    protected String detect(){
        if(this.nbrRoue == 2){
            return "moto";
        } else if (this.nbrRoue == 4) {
            return "voiture";
        } else {
            return "ovni";
        }
    }

    public void afficherType(){
        System.out.println("Le véhicule "+this.nom + " est de type : "+this.detect());
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrRoue() {
        return nbrRoue;
    }

    public void setNbrRoue(int nbrRoue) {
        this.nbrRoue = nbrRoue;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }
}