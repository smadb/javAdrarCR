package com.myJavaapp.Personnages;

public class Paladin extends Perso implements Compétences{

    public Paladin(String nom,int PV,int ATT , int DEF , int ESQ){
        super(nom,PV,DEF,ATT,ESQ);
        setATT((int) Math.round(ATT*0.6));
        setPV((int) Math.round(PV*5));
        setDEF((int) Math.round(DEF*1.2));
    }

    @Override
    public void specialComp(Perso perso) {
        heal();
    }

    @Override
    public void buffStats() {
        setATT((int) Math.round(getATT()*1.5));
        setDEF((int) Math.round(getDEF()*2));

    }

    public void heal(){
        int v = (int) Math.round(Math.random()*100);

        if(v<5){
            setPV(getPV()-(getPV()/5));
            System.out.println("**[FAIL]** "+ this.getNom() +" se blesse seul. ("+ getPV()+"pv)");
            return;
        }
        else if (v>=5 && v<=90) {
            return;
        }
        else if(v>90){
            setPV(getPV()+(getPV()/5));
            System.out.println("**[BUFF]** "+ this.getNom() + " se heal ("+getPV()+"pv)");
        }  if (v>99) {
            setPV(getPV()+(getPV()/5));
            System.out.println("*****[SUPER BUFF]***** "+ this.getNom() +" se heal encore ("+getPV()+"pv)");

        }
    }
}
