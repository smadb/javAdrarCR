import com.myJavaapp.Classes.Habitation;

public class Main {
    public static void main(String[] args) {

        Habitation maisonVide = new Habitation();

        Habitation petiteMaison = new Habitation("Petite Maison",20.00,22.50,1);

        Habitation grandeMaison = new Habitation("Grande Maison",320.80,502.10,4);

        System.out.println(maisonVide);

        petiteMaison.afficherSurface();
        grandeMaison.afficherSurface();


    }
}
