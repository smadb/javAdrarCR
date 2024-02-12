import com.myJavaapp.Classes.Habitation;
import com.myJavaapp.Classes.Vehicule;

public class Main {
    public static void main(String[] args) {

        Habitation maisonVide = new Habitation();

        Habitation petiteMaison = new Habitation("Petite Maison",20.00,22.50,1);

        Habitation grandeMaison = new Habitation("Grande Maison",320.80,502.10,4);

        System.out.println(maisonVide);

        petiteMaison.afficherSurface();
        grandeMaison.afficherSurface();


        Vehicule moto = new Vehicule("Honda kekchoz",2,200);
        Vehicule voiture = new Vehicule("Toyota Yaris",4,90);

        moto.afficherType();
        voiture.afficherType();

        voiture.isFaster(moto);

        voiture.depasser(moto);

        voiture.isFaster(moto);
    }
}
