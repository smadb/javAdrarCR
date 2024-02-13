package com.myJavaapp.Personnages;

public class Perso implements Compétences {
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

        specialComp(cible);

        int currentAttaque = this.currentAttaque(this.ATT);
        int currentDefense = this.currentDefense(this.DEF);

        int currentCibleAttaque = this.currentAttaque(cible.getATT());
        int currentCibleDefense = this.currentDefense(cible.getDEF());



        if(cible.parade()){
            this.messageCombat(cible.getNom()+" pare l'attaque de "+this.nom);
            if(cible.contrer()){
                int valeurCounter = valueCounter(currentCibleAttaque,currentDefense);
                if(valeurCounter>0){
                    this.setPV(this.PV - (currentCibleAttaque/2)+currentDefense); // le contre inflige deux fois moins de dégats
                }
                else{
                    valeurCounter=1;
                    this.setPV(this.PV - valeurCounter); //sinon au moins un PV de perdu
                }
                this.messageCombat(cible.getNom()+" contre-attaque pour " + valeurCounter);

            }
            else {
            }
            return;
        }
        else{
            int valeurAttaque = currentAttaque - currentCibleDefense;
            if(valeurAttaque > 0){
                cible.setPV(cible.getPV()-valeurAttaque);
            }
            else{
                valeurAttaque=1;
                cible.setPV(cible.getPV()-valeurAttaque);
            }
            messageCombat(this.nom + " attaque " + cible.getNom() + " infligeant "+ valeurAttaque +" dégats");
        return;
        }
    }


    public boolean parade(){
        return Math.round(Math.random() * 100) <= this.ESQ;
    }

    public boolean contrer(){
        return Math.round(Math.random() * 100) <= 50;
    }

    public int valueCounter(int currentCibleAttaque,int currentDefense){
        return (currentCibleAttaque)-currentDefense;
    }

    public int currentAttaque(int attaque){
        double operateur = Math.round((Math.random()*100));
        int v = -1;

        if(operateur<=5){
            v=0;
            return v;

        }

        else if(operateur>5 && operateur<=50){
            v= attaque / 2;
            return v;

        }

        else if(operateur>50 && operateur<95){
            v= attaque;
            return v;
        }

        else if (operateur>95) {
            v= attaque*2;
            return v;
        }
    return v;
    }

    public int currentDefense(int defense){
        double operateur = Math.round((Math.random()*100));
        int v = -1;

        if(operateur<=5){
            v=0;
            return v;

        }

        else if(operateur>5 && operateur<=50){
            v= defense / 2;
            return v;

        }

        else if(operateur>50 && operateur<95){
            v= defense;
            return v;

        }

        else if (operateur>95) {
            v= defense*2;
            return v;

        }

        return v;
    }

    public void messageCombat(String message){
        System.out.println("-- " + message);
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
