package com.myJavaapp.Partie;

import com.myJavaapp.Heritage.Personnage;
import com.myJavaapp.Personnages.Perso;

import java.lang.reflect.Array;

public class PartieClassique {
    private Perso Joueur1;
    private Perso Joueur2;
    private int nbrTour;


    public PartieClassique(Perso Joueur1, Perso Joueur2,int nbrTour){
        this.Joueur1=Joueur1;
        this.Joueur2=Joueur2;
        this.nbrTour=nbrTour;
    }


    public void lancerPartie(){
        String issueCombat;
        System.out.println(" ");
        System.out.println("-------------" + "Combat entre " + Joueur1.getNom() +"("+Joueur1.getPV()+"pv)" + " et " + Joueur2.getNom()+"("+Joueur2.getPV()+"pv)"+"-------------");
        int i = 0;
        while(this.nbrTour >=0){
            i+=1;
            System.out.println("Tour " + i);
            System.out.println(" ");
            this.Joueur1.attaque(Joueur2);
            System.out.println(" ");
            this.Joueur2.attaque(Joueur1);
            System.out.println(" ");
            this.afficherStats();
            System.out.println(" ");
            this.nbrTour -= 1;
            if(Joueur1.getPV() <= 0 || Joueur2.getPV()<=0){
                this.nbrTour=-1;
            }
        }
        if(Joueur1.getPV()>0 && Joueur2.getPV()>0){
            issueCombat = "Le combat n'a pas de vainqueur ! ";

        }
        else if(Joueur1.getPV()<=0 && Joueur2.getPV()<= 0){
            issueCombat = "Les combattants se sont entretués !";

        }
        else{
            String vainqueur;
            if(Joueur1.getPV()> Joueur2.getPV()){
                vainqueur = Joueur1.getNom();
            }
            else {
                vainqueur = Joueur2.getNom();

            }
            issueCombat = "[" + vainqueur + "]" + " gagne le combat !";
        }
        System.out.println("-------------" + issueCombat + "-------------");

    }


    private void afficherStats(){
        System.out.println("["+Joueur1.getNom()+"]" + " " + Joueur1.getPV() +" PV" + " / " + Joueur2.getPV() +" PV" + " "+ "["+ Joueur2.getNom()+"]");
    }


    public Perso getJoueur1() {
        return Joueur1;
    }

    public void setJoueur1(Perso joueur1) {
        Joueur1 = joueur1;
    }

    public Perso getJoueur2() {
        return Joueur2;
    }

    public void setJoueur2(Perso joueur2) {
        Joueur2 = joueur2;
    }

    public int getNbrTour() {
        return nbrTour;
    }

    public void setNbrTour(int nbrTour) {
        this.nbrTour = nbrTour;
    }
}
