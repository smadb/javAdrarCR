package com.myJavaapp.Partie;

import com.myJavaapp.Heritage.Personnage;

public class PartieClassique {
    private Personnage Joueur1 = new Personnage();
    private Personnage Joueur2 = new Personnage();
    private int nbrTour;

    public PartieClassique(Personnage Joueur1, Personnage Joueur2,int nbrTour){
        this.Joueur1=Joueur1;
        this.Joueur2=Joueur2;
        this.nbrTour=nbrTour;
    }

    public void lancerPartie(){
        String issueCombat;
        System.out.println("Combat entre " + Joueur1.getNom() +"("+Joueur1.getVie()+"pv)" + " et " + Joueur2.getNom()+"("+Joueur2.getVie()+"pv)");
        int i = 0;
        while(this.nbrTour >=0){
            i+=1;
            System.out.println("Tour " + i);
            this.Joueur1.attaquer(Joueur2);
            this.Joueur2.attaquer(Joueur1);
            this.afficherStats();
            this.nbrTour -= 1;
            if(Joueur1.getVie() <= 0 || Joueur2.getVie()<=0){
                this.nbrTour=-1;
            }
        }
        if(Joueur1.getVie()>0 && Joueur2.getVie()>0){
            issueCombat = "Le combat n'a pas de vainqueur ! ";
        }
        else if(Joueur1.getVie()<=0 && Joueur2.getVie()<= 0){
            issueCombat = "Les combattants se sont entretués !";
        }
        else{
            String vainqueur;
            if(Joueur1.getVie()> Joueur2.getVie()){
                vainqueur = Joueur1.getNom();
            }
            else {
                vainqueur = Joueur2.getNom();
            }
            issueCombat = vainqueur + " gagne le combat !";
        }

        System.out.println(issueCombat);
        this.afficherStats();

    }

    private void afficherStats(){
        System.out.println("PV "+ Joueur1.getNom() + " " + Joueur1.getVie());
        System.out.println("PV "+ Joueur2.getNom() + " " + Joueur2.getVie());
    }


    public Personnage getJoueur1() {
        return Joueur1;
    }

    public void setJoueur1(Personnage joueur1) {
        Joueur1 = joueur1;
    }

    public Personnage getJoueur2() {
        return Joueur2;
    }

    public void setJoueur2(Personnage joueur2) {
        Joueur2 = joueur2;
    }

    public int getNbrTour() {
        return nbrTour;
    }

    public void setNbrTour(int nbrTour) {
        this.nbrTour = nbrTour;
    }
}
