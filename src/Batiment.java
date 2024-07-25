public class Batiment {
    protected int solidite;
    protected Ressource ressourcesNecessairesConstruction;
    protected int tempsConstruction;

    public Batiment() {
    }

    public Batiment(int solidite, Ressource ressourcesNecessairesConstruction, int tempsConstruction) {
        this.solidite = solidite;
        this.ressourcesNecessairesConstruction = ressourcesNecessairesConstruction;
        this.tempsConstruction = tempsConstruction;
    }

    public int getSolidite() {
        return solidite;
    }

    public void setSolidite(int solidite) {
        this.solidite = solidite;
    }

    public Ressource getRessourcesNecessairesConstruction() {
        return ressourcesNecessairesConstruction;
    }

    public void setRessourcesNecessairesConstruction(Ressource ressourcesNecessairesConstruction) {
        this.ressourcesNecessairesConstruction = ressourcesNecessairesConstruction;
    }

    public int getTempsConstruction() {
        return tempsConstruction;
    }

    public void setTempsConstruction(int tempsConstruction) {
        this.tempsConstruction = tempsConstruction;
    }

}
