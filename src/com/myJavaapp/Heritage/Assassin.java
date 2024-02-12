package com.myJavaapp.Heritage;

public class Assassin extends Personnage implements Actions{

    private int bonusAttaque;
    private int chanceCrit;

    public Assassin(String nom, int vie, int attaque , int defense,int chanceCrit){
        super(nom,vie,attaque,defense);
        this.bonusAttaque = attaque;
        this.chanceCrit=chanceCrit;
    }

    public int getBonusAttaque() {
        return bonusAttaque;
    }

    public void setBonusAttaque(int bonusAttaque) {
        this.bonusAttaque = bonusAttaque;
    }

    public void attaquer(Personnage cible){
        this.getNom();
        int vieCible = cible.getVie();
        int defenseCible = cible.getDefense();

        if(this.isCrit()){
            cible.setVie(
                    vieCible - (this.getAttaque()+this.bonusAttaque-defenseCible)
            );
        }
        else{
            cible.setVie(
                    vieCible - (this.getAttaque()-defenseCible)
            );
        }


    }

    private boolean isCrit(){
        double crit = Math.round((Math.random()*100));
        if(crit>this.chanceCrit){
            return false;
        }
        else{
            System.out.println("["+ this.getNom() + "]" + " inflige un crit à " + (this.getAttaque()+this.bonusAttaque));
            return true;
        }
    }
}
