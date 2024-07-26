import java.util.ArrayList;

public class Atelier extends Batiment{

    public Atelier() {
        super();
        this.solidite = 30;
        this.tempsConstruction = 30;
        this.ressourcesNecessairesConstruction = Ressource.fer;
    }

    public void produireOutil(Artisan artisan, String nom, int solidite) {
        Outil outil = new Outil(nom, solidite);
        artisan.getListeOutils().add(outil);
        System.out.println("L'artisan a produit un nouvel outil");
    }

    public void produireArme(Artisan artisan, Soldat soldat, String nom, int solidite) {
        Arme arme = new Arme(nom, solidite);

        soldat.getListeArmes().add(arme);
        System.out.println("L'artisan a produit une arme pour le soldat");
    }

    @Override
    public String toString() {
        return "Atelier{" +
                "solidite=" + solidite +
                ", ressourcesNecessairesConstruction=" + ressourcesNecessairesConstruction +
                ", tempsConstruction=" + tempsConstruction +
                "} " + super.toString();
    }
}
