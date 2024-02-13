package com.myJavaapp.Personnages;

public class Guerrier extends Perso{

    public Guerrier(String nom,int PV,int ATT , int DEF , int ESQ){
        super(nom,PV,DEF,ATT,ESQ);
        setATT((int) Math.round(ATT*1.2));
        setPV((int) Math.round(PV*3));
        setESQ(0);
        setDEF((int) Math.round(DEF*1.4));
    }
}
