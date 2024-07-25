import java.util.ArrayList;
import java.util.List;

public class Ferme extends Batiment {
    private int ressources;

    public Ferme() {
        super();
        this.solidite = 30;
        this.tempsConstruction = 30;
        this.ressourcesNecessairesConstruction = Ressource.bois;
        this.ressources = 50;
    }

    public Ferme(int ressources) {
        this.ressources = ressources;
    }

    public int getRessources() {
        return ressources;
    }

    public void setRessources(int ressources) {
        this.ressources = ressources;
    }

    public void produireNourriture(Ferme ferme) {
        ferme.setRessources(getRessources() + 1);
        System.out.println("La ferme a produit de la nourriture");
    }

    @Override
    public String toString() {
        return "Ferme{" +
                "ressources=" + ressources +
                ", solidite=" + solidite +
                ", ressourcesNecessairesConstruction=" + ressourcesNecessairesConstruction +
                ", tempsConstruction=" + tempsConstruction +
                "} " + super.toString();
    }

    //    public void produireNourriture(Villageois villageois) {
//        villageois.listRessources.add(Ressource.nourriture);
//        System.out.println("Le villageois " + villageois + "a récolté de la nourriture");
//    }
}
