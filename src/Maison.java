public class Maison extends Batiment {

    public Maison() {
        super();
        this.solidite = 30;
        this.tempsConstruction = 30;
        this.ressourcesNecessairesConstruction = Ressource.pierre;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "solidite=" + solidite +
                ", ressourcesNecessairesConstruction=" + ressourcesNecessairesConstruction +
                ", tempsConstruction=" + tempsConstruction +
                "} " + super.toString();
    }
}
