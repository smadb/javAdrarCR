//import com.myJavaapp.Classes.Habitation;
//import com.myJavaapp.Classes.Vehicule;
import com.myJavaapp.Heritage.Personnage;
import com.myJavaapp.Heritage.Assassin;
import com.myJavaapp.Heritage.Guerrier;
import com.myJavaapp.Partie.PartieClassique;



public class Main {
    public static void main(String[] args) {

        Assassin PersonnageAssassin = new Assassin("Assassin",100,20,2,30);
        Guerrier PersonnageGuerrier = new Guerrier("Guerrier",300,6,10,50);

        PartieClassique Partie1 = new PartieClassique(PersonnageGuerrier,PersonnageAssassin,50);

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
