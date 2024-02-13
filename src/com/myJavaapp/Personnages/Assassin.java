package com.myJavaapp.Personnages;

public class Assassin extends Perso{

    public Assassin(String nom,int PV,int ATT , int DEF , int ESQ){
        super(nom,PV,DEF,ATT,ESQ);
        setPV((int) Math.round(PV*0.8));
        setESQ((int) Math.round(ESQ*1.3));
        setATT((int) Math.round(ATT*2));
        setDEF((int) Math.round(DEF*0.3));
    }

    public int valueCounter(int currentCibleAttaque,int currentDefense){
        return (currentCibleAttaque)-currentDefense;
    }
}
