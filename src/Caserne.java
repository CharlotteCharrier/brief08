import java.util.ArrayList;
import java.util.List;

public class Caserne extends Batiment {
    private List<Soldat> listeSoldats;

    public Caserne() {
        super();
        this.solidite = 30;
        this.tempsConstruction = 30;
        this.ressourcesNecessairesConstruction = Ressource.pierre;
        this.listeSoldats = new ArrayList<>();
    }

    public List<Soldat> getListeSoldats() {
        return listeSoldats;
    }

    public void setListeSoldats(List<Soldat> listeSoldats) {
        this.listeSoldats = listeSoldats;
    }

    @Override
    public String toString() {
        return "Caserne{" +
                "listeSoldats=" + listeSoldats +
                ", solidite=" + solidite +
                ", ressourcesNecessairesConstruction=" + ressourcesNecessairesConstruction +
                ", tempsConstruction=" + tempsConstruction +
                "} " + super.toString();
    }
}
