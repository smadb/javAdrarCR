package com.myJavaapp.Personnages;

public class Guerrier extends Perso implements Compétences{

    public Guerrier(String nom,int PV,int ATT , int DEF , int ESQ){
        super(nom,PV,DEF,ATT,ESQ);
        setATT((int) Math.round(ATT*1.2));
        setPV((int) Math.round(PV*3));
        setESQ(0);
        setDEF((int) Math.round(DEF*1.4));
    }

    @Override
    public void specialComp(Perso perso) {
        renforcement();
    }

    @Override
    public void buffStats() {
        setDEF(getDEF()*2);
    }

    public void renforcement(){
        int v = (int) Math.round(Math.random()*100);

        if(v<5){
            this.setDEF(getDEF()-2);
            System.out.println("**[FAIL]** Guerrier brise une partie de son armure. ("+ (getDEF())+"def)");
            return;
        }
        else if (v>=5 && v<=90) {
            return;
        }
        else if(v>90){
            this.setDEF(getDEF()+2);
            System.out.println("**[BUFF]** Guerrier renforce son armure ("+getDEF()+"def)");
        }  if (v>99) {
            this.setDEF(getDEF()+2);
            this.setPV(getPV()+(getDEF()*10));
            System.out.println("*****[SUPER BUFF]***** Guerrier renforce son armure et se heal (+"+getDEF()*20+"pv)");

        }
    }
}
