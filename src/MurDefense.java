public class MurDefense extends Batiment {

    public MurDefense() {
        super();
        this.solidite = 300;
        this.tempsConstruction = 100;
        this.ressourcesNecessairesConstruction = Ressource.pierre;
    }

    @Override
    public String toString() {
        return "MurDefense{" +
                "solidite=" + solidite +
                ", ressourcesNecessairesConstruction=" + ressourcesNecessairesConstruction +
                ", tempsConstruction=" + tempsConstruction +
                "} " + super.toString();
    }
}
