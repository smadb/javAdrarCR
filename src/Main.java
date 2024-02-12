import com.myJavaapp.Classes.Class1;
import com.myJavaapp.Classes.Habitation;


public class Main {
    public static void main(String[] args) {

        Habitation maisonVide = new Habitation();

        Habitation petiteMaison = new Habitation("Petite Maison",20.00,22.50);

        Habitation grandeMaison = new Habitation("Grande Maison",320.80,502.10);


        double surfacePetiteMaison = petiteMaison.surface();
        double surfaceGrandeMaison = grandeMaison.surface();

        petiteMaison.afficherSurface(surfacePetiteMaison);
        grandeMaison.afficherSurface(surfaceGrandeMaison);
    }
}
