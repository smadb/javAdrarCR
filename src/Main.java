//import com.myJavaapp.Classes.Habitation;
//import com.myJavaapp.Classes.Vehicule;
import com.myJavaapp.Heritage.Personnage;
import com.myJavaapp.Partie.PartieClassique;
import com.myJavaapp.Personnages.Assassin;
import com.myJavaapp.Personnages.Guerrier;
import com.myJavaapp.Personnages.Perso;


public class Main {
    public static void main(String[] args) {

        Perso J1 = new Perso("Olivier",50,10,16,30);
        Perso J2 = new Perso("César",50,10,12,70);

        Assassin J3 = new Assassin("Assassin",100,10,8,50);
        Guerrier J4 = new Guerrier("Guerrier",100,10,8,50);

    PartieClassique Partie1 = new PartieClassique(J3,J4,100);

    Partie1.lancerPartie();






//        Habitation maisonVide = new Habitation();
//
//        Habitation petiteMaison = new Habitation("Petite Maison",20.00,22.50,1);
//
//        Habitation grandeMaison = new Habitation("Grande Maison",320.80,502.10,4);
//
//        System.out.println(maisonVide);
//
//        petiteMaison.afficherSurface();
//        grandeMaison.afficherSurface();
//
//
//        Vehicule moto = new Vehicule("Honda kekchoz",2,200);
//        Vehicule voiture = new Vehicule("Toyota Yaris",4,90);
//
//        moto.afficherType();
//        voiture.afficherType();
//
//        voiture.isFaster(moto);
//
//        voiture.depasser(moto);
//
//        voiture.isFaster(moto);
    }
}
