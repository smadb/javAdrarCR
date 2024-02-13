package com.myJavaapp.Personnages;

public class Assassin extends Perso implements Compétences{

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

    @Override
    public void specialComp(Perso perso) {
        buffArmes();
    }

    @Override
    public void buffStats() {
        setATT((int) Math.round(getATT()*2));
    }

    public void buffArmes(){
        int v = (int) Math.round(Math.random()*100);

        if(v<5){
            int newValue = getATT() - ((int) Math.round(getATT()*0.3));
            int difference = newValue - getATT();
            System.out.println("**[FAIL]** "+ this.getNom() +" casse une de ses dagues (-"+difference+"att)");
            setATT(newValue);
            return;
        }
        else if (v>=5 && v<=90) {
            return;
        }
        else if(v>90){
            int newValue = (int) Math.round(getATT()*1.3);
            int difference = newValue - getATT();
            System.out.println("**[BUFF]** "+ this.getNom() +" buff son arme (+"+ difference +"att)");
            setATT(newValue);
        } if (v>99) {
            int newValue = (int) Math.round(getATT()*1.5);
            int difference = newValue - getATT();
            System.out.println("*****[SUPER BUFF]***** "+ this.getNom() +" buff son arme une deuxième fois (+"+ difference +"att)");
            setATT(newValue);
        }

    }
}
