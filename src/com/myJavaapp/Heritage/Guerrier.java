package com.myJavaapp.Heritage;

public class Guerrier extends Personnage implements Actions{

    private int bonusDefense;
    private int chanceParade;

    public Guerrier(String nom,int vie,int attaque,int defense, int chanceParade){
        super(nom,vie,attaque,defense);
        this.bonusDefense = defense;
        this.chanceParade=chanceParade;
    }

    public int getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }

    public void attaquer(Personnage cible){
        int vieCible = cible.getVie();
        int defenseCible = cible.getDefense();

        if(this.heal()){
            cible.setVie(
                    vieCible - (this.getAttaque()-defenseCible)
            );
            this.setVie(this.getVie()+this.bonusDefense);
        }
        else{
            cible.setVie(
                    vieCible - (this.getAttaque()-defenseCible)
            );
        }
    }


    public boolean heal(){
        double parer = Math.round((Math.random()*100));
        if(parer>this.chanceParade){
            return false;
        }
        else{
            System.out.println("["+this.getNom() + "]" + " se heal de " + this.bonusDefense);
            return true;
        }
    }
}

