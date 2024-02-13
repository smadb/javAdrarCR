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
        heal();
    }

    public void heal(){
        int v = (int) Math.round(Math.random()*100);

        if(v<5){
            this.setPV(getPV()-(getATT()/2));
            System.out.println("**[FAIL]** Guerrier se blesse tout seul. (-"+ (getATT()/2)+"pv)");
            return;
        }
        else if (v>=5 && v<=90) {
            return;
        }
        else if(v>90){
            this.setPV(getPV()+getDEF());
            System.out.println("**[BUFF]** Guerrier se heal (+"+getDEF()+"pv)");
        } else if (v>99) {
            this.setPV(getPV()+(getDEF()*10));
            System.out.println("*****[SUPER BUFF]***** Guerrier se heal (+"+getDEF()+"pv)");

        }
    }
}
