import java.util.ArrayList;

public class Atelier extends Batiment{

    public Atelier() {
        super();
        this.solidite = 30;
        this.tempsConstruction = 30;
        this.ressourcesNecessairesConstruction = Ressource.fer;
    }

    public void produireOutil(Artisan artisan) {
        Outil outil = new Outil();
        artisan.getListeOutils().add(outil);
        System.out.println("L'artisan " + artisan + "a produit un nouvel outil " + outil);
    }

    public void produireArme(Artisan artisan, Soldat soldat) {
        Arme arme = new Arme();

        soldat.getListeArmes().add(arme);
        System.out.println("L'artisan " + artisan + "a produit " + arme + "pour le soldat " + soldat);
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
