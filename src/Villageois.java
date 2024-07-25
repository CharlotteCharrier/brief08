import java.util.ArrayList;
import java.util.List;

public class Villageois extends Personne {
    private Maison currentMaison;

    public Maison getCurrentMaison() {
        return currentMaison;
    }

    public Villageois() {
        super();
    }

    public void setCurrentMaison(Maison currentMaison) {
        this.currentMaison = currentMaison;
    }

    public void abriter(Maison maison) {
        this.setCurrentMaison(maison);
        System.out.println("Le villageois est abrité dans la maison " + maison);
    }


    public Batiment construire(TypeDeBatiment typeBatiment) {
        Batiment monBatiment = new Maison();

        switch (typeBatiment) {
            case Maison -> {
                monBatiment = new Maison();
            }
            case Ferme -> {
                monBatiment = new Ferme(30);
            }
            case Atelier -> {
                monBatiment = new Atelier();
            }
            case Caserne -> {
                monBatiment = new Caserne();
            }
            case MurDefense -> {
                monBatiment = new MurDefense();
            }
        }
        return monBatiment;
    }
}
