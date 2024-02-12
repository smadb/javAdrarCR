package com.myJavaapp.Personnages;

public class Perso {
    private String nom;
    private int PV;
    private int DEF;
    private int ATT;
    private int ESQ;


    public Perso(String nom,int PV,int DEF,int ATT,int ESQ){
        this.nom=nom;
        this.ATT=ATT;
        this.PV=PV;
        this.DEF=DEF;
        this.ESQ=ESQ;
    }

    public void attaque(Perso cible){
        if(cible.parade()){
            if(cible.contrer()){
                int valeurCounter = ((cible.getATT()/2)+this.DEF);
                if(valeurCounter>0){
                    this.setPV(this.PV - ((cible.getATT()/2)+this.DEF)); // le contre inflige deux fois moins de dégats
                }
                else{
                    this.setPV(this.PV - 1); //sinon au moins un PV de perdu
                }

            }
            else {
            }
            return;
        }
        else{
            int valeurAttaque = this.ATT - cible.getDEF();
            if(valeurAttaque > 0){
                cible.setPV(cible.getPV()-valeurAttaque);
            }
            else{
                cible.setPV(cible.getPV()-1);
            }
        return;
        }
    }


    public boolean parade(){
        return Math.round(Math.random() * 100) <= this.ESQ;
    }

    public boolean contrer(){
        return Math.round(Math.random() * 100) <= 50;

    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPV() {
        return PV;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }

    public int getDEF() {
        return DEF;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }

    public int getATT() {
        return ATT;
    }

    public void setATT(int ATT) {
        this.ATT = ATT;
    }

    public int getPAR() {
        return ESQ;
    }

    public void setPAR(int PAR) {
        this.ESQ = PAR;
    }

    public int getESQ() {
        return ESQ;
    }

    public void setESQ(int ESQ) {
        this.ESQ = ESQ;
    }
}
